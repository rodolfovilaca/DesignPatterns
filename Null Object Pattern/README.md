# Null Object Pattern
In Null Object pattern, a null object replaces check of NULL object instance. Instead of putting 
if check for a null value, Null Object reflects a do nothing relationship.
Such Null object can also be used to provide default behaviour in case data is not available.
In Null Object pattern, we create an abstract class specifying various operations to be done, 
concrete classes extending this class and a null object class providing do nothing implemention 
of this class and will be used seemlessly where we need to check null value.
## Aplicability
Use the Null Object pattern when:
* an object requires a collaborator.
* The Null Object pattern does not introduce this collaboration--it makes use of a collaboration that already exists.
* some collaborator instances should do nothing.
* you want to abstract the handling of null away from the client.

## Pros and Cons
* The Null Object class is often implemented as a Singleton. Since a null object usually does not have any state, its state can't change,
so multiple instances are identical. Rather than use multiple identical instances, the system can just use a single instance repeatedly.
* If some clients expect the null object to do nothing one way and some another, multiple NullObject classes will be required.
If the do nothing behavior must be customized at run time, the NullObject class will require pluggable variables so that the client can specify how the null object should do nothing (see the discussion of pluggable adaptors in the Adapter pattern). This may generally be a symptom of the AbstractObject not having a well defined (semantic) interface.
* A Null Object does not transform to become a Real Object. If the object may decide to stop providing do nothing behavior and start providing real behavior, it is not a null object.
It may be a real object with a do nothing mode, such as a controller which can switch in and out of read-only mode. If it is a single object which must mutate from a do nothing object to a real one, it should be implemented with the State pattern or perhaps the Proxy pattern. In this case a Null State may be used or the proxy may hold a Null Object.
* The use of a null object can be similar to that of a Proxy, but the two patterns have different purposes.
A proxy provides a level of indirection when accessing a real subject,
thus controlling access to the subject. A null collaborator does not hide a real object and control access to it, it replaces the real object. A proxy may eventually mutate to start acting like a real subject.
A null object will not mutate to start providing real behavior, it will always provide do nothing behavior.
* A Null Object can be a special case of the Strategy pattern. Strategy specifies several ConcreteStrategy classes as different approaches for accomplishing a task.
If one of those approaches is to consistently do nothing, that ConcreteStrategy is a NullObject.
For example, a Controller is a View's Strategy for handling input, and NoController is the Strategy that ignores all input.
* A Null Object can be a special case of the State pattern. Normally, each ConcreteState has some do nothing methods because they're not appropriate for that state.
In fact, a given method is often implemented to do something useful in most states but to do nothing in at least one state.
If a particular ConcreteState implements most of its methods to do nothing or at least give null results, it becomes a do nothing state and as such is a null state.
* A Null Object can be used to allow a Visitor to safely visit a hierarchy and handle the null situation.
* Null Object is a concrete collaborator class that acts as the collaborator for a client which needs one. 
The null behavior is not designed to be mixed into an object that needs some do nothing behavior. 
It is designed for a class which delegates to a collaborator all of the behavior that may or may not be do nothing behavior.

## Examples
[Shape Factory with Null Object](https://github.com/rodolfovilaca/DesignPatterns/tree/master/Observer%20Pattern/src/dataObserver)
