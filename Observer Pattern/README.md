# Observer Pattern
Observer pattern is a behavioral pattern which is used when there is one-to-many relationship between objects such as if one object is modified, its depenedent objects are to be notified automatically.

## Aplicability
Use the Observer pattern in any of the following situations:
* When an abstraction has two aspects, one dependent on the
other.Encapsulating these aspects in separate objects lets you vary
andreuse them independently.
* When a change to one object requires changing others, and youdon't know
how many objects need to be changed.
* When an object should be able to notify other objects without
makingassumptions about who these objects are. In other words, you don'twant
these objects tightly coupled.

## Consequences
The Observer pattern lets you vary subjects and observers independently. You can
reuse subjects without reusing theirobservers, and vice versa. It lets you add
observers withoutmodifying the subject or other observers.
Further benefits and liabilities of the Observer pattern include thefollowing:
1. Abstract coupling between Subject and Observer.All a subject knows is that
it has a list of observers, eachconforming to the simple interface of the
abstract Observer class.The subject doesn't know the concrete class of any
observer. Thus thecoupling between subjects and observers is abstract and
minimal.
Because Subject and Observer aren't tightly coupled, they can belong
todifferent layers of abstraction in a system. A lower-level subjectcan
communicate and inform a higher-level observer, thereby keeping
thesystem's layering intact. If Subject and Observer are lumpedtogether,
then the resulting object must either span two layers (andviolate the
layering), or it must be forced to live in one layer orthe other (which
might compromise the layering abstraction).
2. Support for broadcast communication.Unlike an ordinary request, the
notification that a subject sendsneedn't specify its receiver. The
notification is broadcastautomatically to all interested objects that
subscribed to it. Thesubject doesn't care how many interested objects exist;
its onlyresponsibility is to notify its observers. This gives you the
freedomto add and remove observers at any time. It's up to the observer
tohandle or ignore a notification.
3. Unexpected updates.Because observers have no knowledge of each other's
presence, they canbe blind to the ultimate cost of changing the subject.
A seeminglyinnocuous operation on the subject may cause a cascade of updates
toobservers and their dependent objects. Moreover, dependency criteriathat
aren't well-defined or maintained usually lead to spuriousupdates, which
can be hard to track down.
This problem is aggravated by the fact that the simple update
protocolprovides no details on what changed in the subject.
Withoutadditional protocol to help observers discover what changed, they
maybe forced to work hard to deduce the changes.

## Implementation

1. Mapping subjects to their observers.The simplest way for a subject to keep
track of the observers itshould notify is to store references to them
explicitly in thesubject. However, such storage may be too expensive when
there aremany subjects and few observers. One solution is to trade space
fortime by using an associative look-up (e.g., a hash table) to maintainthe
subject-to-observer mapping. Thus a subject with no observersdoes not incur
storage overhead. On the other hand, this approachincreases the cost of
accessing the observers.

1. Observing more than one subject.It might make sense in some situations for
an observer to depend onmore than one subject. For example, a spreadsheet
may depend on morethan one data source. It's necessary to extend the Update
interfacein such cases to let the observer know which subject is sendingthe
notification. The subject can simply pass itself as a parameterin the Update
operation, thereby letting the observer know whichsubject to examine.

1. Who triggers the update?The subject and its observers rely on the
notification mechanism tostay consistent. But what object actually calls
Notify to trigger theupdate? Here are two options:
    1. Have state-setting operations on Subject call Notify after
theychange the subject's state. The advantage of this approach is
thatclients don't have to remember to call Notify on the subject.
Thedisadvantage is that several consecutive operations will
causeseveral consecutive updates, which may be inefficient.
    1. Make clients responsible for calling Notify at the right time.The
advantage here is that the client can wait to trigger the updateuntil
after a series of state changes has been made, therebyavoiding
needless intermediate updates. The disadvantage is thatclients have
an added responsibility to trigger the update. Thatmakes errors more
likely, since clients might forget to call Notify.

1. Dangling references to deleted subjects.Deleting a subject should not
produce dangling references in itsobservers. One way to avoid dangling
references is to make thesubject notify its observers as it is deleted so
that they can resettheir reference to it. In general, simply deleting the
observers is not an option, because other objects may reference them, or
they may beobserving other subjects as well.

1. Making sure Subject state is self-consistent beforenotification.It's
important to make sure Subject state is self-consistent beforecalling
Notify, because observers query the subject for its currentstate in the
course of updating their own state.

1. Avoiding observer-specific update protocols: the pushand pull models.
Implementations of the Observer pattern often havethe subject broadcast
additional information about the change. Thesubject passes this
information as an argument to Update. The amountof information may vary
widely.
At one extreme, which we call the push model, the subjectsends observers
detailed information about the change, whether theywant it or not. At the
other extreme is the pull model;the subject sends nothing but the most
minimal notification, andobservers ask for details explicitly thereafter.
The pull model emphasizes the subject's ignorance of its observers,whereas
the push model assumes subjects know something about theirobservers' needs.
The push model might make observers less reusable,because Subject classes
make assumptions about Observer classes thatmight not always be true. On
the other hand, the pull model may beinefficient, because Observer classes
must ascertain what changedwithout help from the Subject.

1. Specifying modifications of interest explicitly.You can improve update
efficiency by extending the subject'sregistration interface to allow
registering observers only forspecific events of interest. When such an
event occurs, the subjectinforms only those observers that have registered
interest in thatevent. One way to support this uses the notion ofaspects
for Subject objects. To register interest in particular events, observers
are attached to theirsubjects using:
    ```void attach(Observer observer);```
    
Where interest specifies the eventof interest. At notification time, the
subject supplies the changedaspect to its observers as a parameter to the
Update operation. For example:
    ```void update(Subject subject);```
1. Encapsulating complex update semantics.When the dependency relationship
between subjects and observers isparticularly complex, an object that
maintains these relationships mightbe required. We call such an object a
ChangeManager. Itspurpose is to minimize the work required to make observers
reflect achange in their subject. For example, if an operation
involveschanges to several interdependent subjects, you might have
toensure that their observers are notified only after all thesubjects have
been modified to avoid notifying observers more thanonce.
ChangeManager has three responsibilities:
    1. maps a subject to its observers and provides an interface
tomaintain this mapping. This eliminates the need for subjects to
maintainreferences to their observers and vice versa.
    1. It defines a particular update strategy.
    1. It updates all dependent observers at the request of a subject.
    
## Examples
[Data View Observer](https://github.com/rodolfovilaca/DesignPatterns/tree/master/Observer%20Pattern/src/dataObserver)
