# Factory Pattern
This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface. Factory relies on its subclasses to define the factory method so that it returns an instance of the appropriate object.

## Applicability
Use the Factory Method pattern when
* a class can't anticipate the class of objects it must create.
* a class wants its subclasses to specify the objects it creates.
* classes delegate responsibility to one of several helper subclasses, and
you want to localize the knowledge of which helper subclass is the delegate.

## Examples
* [Shape Factory] (https://github.com/rodolfovilaca/DesignPatterns/tree/master/Factory/src)
