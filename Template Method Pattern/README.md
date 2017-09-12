# Template Method Pattern
In Template pattern, an abstract class exposes defined skeleton(template) to execute its methods deferring somesteps to
subclasses. Its subclasses can override the method implementation as per need but the invocation is to be in the same way as defined by an abstract class.
This pattern comes under behavior pattern category.

## Aplicability
The Template Method pattern should be used
* to implement the invariant parts of an algorithm once and leave it upto
subclasses to implement the behavior that can vary.
* when common behavior among subclasses should be factored and localizedin
a common class to avoid code duplication. This is a good example
of"refactoring to generalize" as described by Opdyke andJohnson.
You first identify thedifferences in the existing code and then separate
the differencesinto new operations. Finally, you replace the differing code
with atemplate method that calls one of these new operations.
* to control subclasses extensions. You can define a template methodthat calls
"hook" operations (see Consequences) at specific points,thereby permitting
extensions only at those points.

## Pros and Cons
Template methods are a fundamental technique for code reuse. They areparticularly
important in class libraries, because they are the meansfor factoring out common
behavior in library classes.
Template methods lead to an inverted control structure that'ssometimes referred
to as "the Hollywood principle," that is, "Don'tcall us, we'll call you" [Swe85].
This refers tohow a parent class calls the operations of a subclass and not theother
way around.
Template methods call the following kinds of operations:
* concrete operations (either on the ConcreteClass or onclient classes);
* concrete AbstractClass operations (i.e., operations that aregenerally
useful to subclasses);
* primitive operations (i.e., abstract operations);
* factory methods (see Factory Method (121)); and
* hook operations, which provide default behavior thatsubclasses can extend
if necessary. A hook operation often doesnothing by default.
It's important for template methods to specify which operations arehooks (may
be overridden) and which are abstract operations(must be overridden). To reuse
an abstract class effectively,subclass writers must understand which operations
are designed foroverriding.
A subclass can extend a parent class operation's behavior by overriding the
operation and calling the parent operation explicitly
Unfortunately, it's easy to forget to call the inherited operation.We can transform
such an operation into a template method to givethe parent control over how
subclasses extend it. The idea is tocall a hook operation from a template method
in the parent class.Then subclasses can then override this hook operation.

## Implementation

Three implementation issues are worth noting:
1. Using C++ access control.In C++, the primitive operations that a template
method calls can bedeclared protected members. This ensures that they are
only called bythe template method. Primitive operations that must be
overridden aredeclared pure virtual. The template method itself should not
beoverridden; therefore you can make the template method a nonvirtualmember
function.
2. Minimizing primitive operations.An important goal in designing template
methods is to minimize thenumber of primitive operations that a subclass
must override to fleshout the algorithm. The more operations that need
overriding, the moretedious things get for clients.
3. Naming conventions.You can identify the operations that should be
overridden by adding aprefix to their names. For example, the MacApp
framework for Macintoshapplications [App89] prefixes template method names
with "Do-":"DoCreateDocument", "DoRead", and so forth.
    
## Examples
[Worker Template](https://github.com/rodolfovilaca/DesignPatterns/tree/master/Observer%20Pattern/src/dataObserver)
