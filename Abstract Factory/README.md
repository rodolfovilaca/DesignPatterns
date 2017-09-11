# Abstract Factory
Abstract Factory is a creational design pattern that provides an interface for creating families of related or dependent objects without
specifying their concrete classes. In short is a super-factory which creates other factories.

## Aplicability
Use the Abstract Factory pattern when:
* a system should be independent of how its products are created, composed,
and represented.
* a system should be configured with one of multiple families of products.
* a family of related product objects is designed to be used together, and
you need to enforce this constraint.
* you want to provide a class library of products, and you want to reveal
just their interfaces, not their implementations.

## Pros and Cons:
The Abstract Factory pattern has the following benefits and liabilities:

1. It isolates concrete classes. The Abstract Factory pattern helps you control
the classes of objects that an application creates. Because a factory
encapsulates the responsibility and the process of creating product objects,
it isolates clients from implementation classes. Clients manipulate
instances through their abstract interfaces. Product class names are
isolated in the implementation of the concrete factory; they do not appear
in client code.

1. It makes exchanging product families easy. The class of a concrete factory
appears only once in an application—that is, where it's instantiated. This
makes it easy to change the concrete factory an application uses. It can
use different product configurations simply by changing the concrete
factory. Because an abstract factory creates a complete family of products,
the whole product family changes at once. In our user interface example,
we can switch from Motif widgets to Presentation Manager widgets simply
by switching the corresponding factory objects and recreating the
interface.

1. It promotes consistency among products. When product objects in a family
are designed to work together, it's important that an application use
objects from only one family at a time. AbstractFactory makes this easy
to enforce.

1. Supporting new kinds of products is difficult. Extending abstract factories
to produce new kinds of Products isn't easy. That's because the
AbstractFactory interface fixes the set of products that can be created.
Supporting new kinds of products requires extending the factory interface,
which involves changing the AbstractFactory class and all of its subclasses.
We discuss one solution to this problem in the Implementation section.

## Implementation

Here are some useful techniques for implementing the Abstract Factory pattern:
* Factories as singletons. An application typically needs only one instance
of a ConcreteFactory per product family. So it's usually best implemented
as a Singleton.
* Creating the products. AbstractFactory only declares an interface for
creating products. It's up to ConcreteProduct subclasses to actually create
them. The most common way to do this is to define a factory method (see 
Factory Method) for each product. A concrete factory will specify
its products by overriding the factory method for each. While this
implementation is simple, it requires a new concrete factory subclass for
each product family, even if the product families differ only slightly.
If many product families are possible, the concrete factory can be
implemented using the Prototype pattern([link](https://github.com/rodolfovilaca/DesignPatterns/tree/master/Prototype%20Pattern)). The concrete factory is
initialized with a prototypical instance of each product in the family,
and it creates a new product by cloning its prototype. The Prototype-based
approach eliminates the need for a new concrete factory class for each new
product family.
* Defining extensible factories. AbstractFactory usually defines a different
operation for each kind of product it can produce. The kinds of products
are encoded in the operation signatures. Adding a new kind of product
requires changing the AbstractFactory interface and all the classes that
depend on it.
A more flexible but less safe design is to add a parameter to operations
that create objects. This parameter specifies the kind of object to be
created. It could be a class identifier, an integer, a string, or anything
else that identifies the kind of product. In fact with this approach,
AbstractFactory only needs a single "Make" operation with a parameter
indicating the kind of object to create. This is the technique used in the
Prototype- and the class-based abstract factories discussed earlier.

## Examples:
* [Shape and Color Abstract Factory](https://github.com/rodolfovilaca/DesignPatterns/tree/master/Abstract%20Factory/src/shapeFactory)

## Research Sources:
* Design Patterns: Elements of Reusable Object-Oriented Software
* [Tutorials Point](https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm)
