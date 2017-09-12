# Strategy Pattern
In Strategy pattern, a class behavior or its algorithm can be changed at run time. This type of design pattern comes under behavior pattern.
In Strategy pattern, we create objects which represent various strategies and a context object whose behavior varies as per its strategy object.
The strategy object changes the executing algorithm of the context object.
Define a family of algorithms, encapsulate each one, and make them interchangeable.
Strategy lets the algorithm vary independently from clients that use it.

## Aplicability
Use the Strategy pattern when:
* many related classes differ only in their behavior. Strategies provide a
way to configure a class with one of many behaviors.
* you need different variants of an algorithm. For example, you might
definealgorithms reflecting different space/time trade-offs.Strategies
can be used when these variants are implemented as a class hierarchy of
algorithms.
* an algorithm uses data that clients shouldn't know about. Use theStrategy
pattern to avoid exposing complex, algorithm-specific data structures.
* a class defines many behaviors, and these appear as multiple conditional
statements in its operations. Instead of many conditionals, move related
conditional branches into their ownStrategy class.

## Pros and Cons
The Strategy pattern has the following benefits and drawbacks:
1. Families of related algorithms.Hierarchies of Strategy classes define a
family of algorithms orbehaviors for contexts to reuse. Inheritance canhelp
factor out common functionality of the algorithms.
2. An alternative to subclassing.Inheritance offers another way to support
a variety of algorithms orbehaviors. You can subclass a Context class
directly to give it different behaviors. But this hard-wires the behavior
into Context.It mixes the algorithm implementation with Context's, making
Context harder to understand, maintain, and extend. And you can't vary
thealgorithm dynamically. You wind up with many related classes whoseonly
difference is the algorithm or behavior they employ.Encapsulating the
algorithm in separate Strategy classes lets you varythe algorithm
independently of its context, making it easier toswitch, understand, and
extend.
3. Strategies eliminate conditional statements.The Strategy pattern offers
an alternative to conditional statements forselecting desired behavior.
When different behaviors are lumped into oneclass, it's hard to avoid using
conditional statements to select the right behavior. Encapsulating the
behavior in separate Strategy classeseliminates these conditional
statements. Code containing many conditional statements often indicatesthe need to
apply the Strategy pattern.
4. A choice of implementations.Strategies can provide different
implementations of the samebehavior. The client can choose among strategies
with differenttime and space trade-offs.
5. Clients must be aware of different Strategies.The pattern has a potential
drawback in that a client must understandhow Strategies differ before it
can select the appropriate one.Clients might be exposed to implementation
issues. Therefore youshould use the Strategy pattern only when the variation
in behavior isrelevant to clients.
6. Communication overhead between Strategy and Context.The Strategy interface
is shared by all ConcreteStrategy classeswhether the algorithms they
implement are trivial or complex. Henceit's likely that some
ConcreteStrategies won't use all the informationpassed to them through this
interface; simple ConcreteStrategies mayuse none of it! That means there
will be times when the contextcreates and initializes parameters that never
get used. If this is anissue, then you'll need tighter coupling between
Strategy and Context.
7. Increased number of objects.Strategies increase the number of objects in
an application. Sometimesyou can reduce this overhead by implementing
strategies as statelessobjects that contexts can share. Any residual state
is maintained by thecontext, which passes it in each request to the Strategy
object. Sharedstrategies should not maintain state across invocations. The
Flyweight () pattern describes this approach in moredetail.

## Implementation

Consider the following implementation issues:
1. Defining the Strategy and Context interfaces.The Strategy and Context
interfaces must give a ConcreteStrategyefficient access to any data it needs
from a context, and vice versa.
One approach is to have Context pass data in parameters to
Strategyoperations—in other words, take the data to the strategy. This
keepsStrategy and Context decoupled. On the other hand, Context mightpass
data the Strategy doesn't need.
Another technique has a context pass itself as an argument, andthe strategy
requests data from the context explicitly.Alternatively, the strategy can
store a reference to its context,eliminating the need to pass anything at
all. Either way, thestrategy can request exactly what it needs. But now
Context mustdefine a more elaborate interface to its data, which couples
Strategyand Context more closely.
The needs of the particular algorithm and its data requirements
willdetermine the best technique.
1. Strategies as template parameters.In C++ templates can be used to configure
a class with a strategy.This technique is only applicable if:
    1. the Strategy can be selected at compile-time
    1. it does not have to be changed at run-time.In this case, the class to be configured (e.g., Context) is defined
as a template class that has a Strategy class as aparameter:
With templates, there's no need to define an abstract class that defines
the interface to the Strategy. Using Strategy as atemplate parameter also
lets you bind a Strategy to itsContext statically, which can increase
efficiency.
1. Making Strategy objects optional.The Context class may be simplified if
it's meaningful not tohave a Strategy object. Context checks to see if it
has a Strategyobject before accessing it. If there is one, then Context
uses itnormally. If there isn't a strategy, then Context carries out
defaultbehavior. The benefit of this approach is that clients don't have
todeal with Strategy objects at all unless they don't like thedefault
behavior.
    
## Examples
[Payment Strategy](https://github.com/rodolfovilaca/DesignPatterns/tree/master/Strategy%20Pattern/src/paymentStrategy)
