# Design-Patterns
The following repository contains a java implementation of the GoF design patterns. The examples were taken from the following book.
<div>
 <a href= "http://www.amazon.com/Design-Patterns-Dummies-Steve-Holzner/dp/0471798541"> Design Patterns for Dummies by Steve Holzner, PhD</a> 

</div>
<b> Strategy Pattern </b>
</hr>

The Design Patterns authors define the Strategy pattern as:

Define a family of algorithms, encapsulate each one, and make them interchangeable. [The] Strategy [pattern] lets the algorithm vary independently from clients that use it.
The Strategy pattern lets you build software as a loosely coupled collection of interchangeable parts, in contrast to a monolithic, tightly coupled system. That loose coupling makes your software much more extensible, maintainable, and reusable.

Taken from http://www.javaworld.com/article/2074195/swing-gui-programming/strategy-for-success.html

<b> Decorator Pattern </b>

Decorators decorate an object by enhancing (or in some cases restricting) its functionality. Those objects are referred to as decorated. Decorators extend the decorated class (or implement the decorated interface), which lets decorators masquerade as the objects they decorate. They also maintain a reference to a Decorated instance. That instance is the object that the decorator decorates.

Taken from http://www.javaworld.com/article/2075920/core-java/decorate-your-java-code.html

<b> Chain of responsibility pattern </b>

You use this pattern when not all your observers are created equal. For exam-
ple, say that you have a layered application with a set chain of command for
events — a mouse event may originate in a particular control, then bubble up
to the control’s container, then the container’s window, and eventually up to
the application itself. The first object that can handle the event correctly
should grab it and stop the event from further bubbling.
In other words, if you want to process your notifications using a hierarchical
chain of objects, this is your pattern.

<b> Adapter Pattern </b>

An adapter uses composition to store the
object it’s supposed to adapt, and when the adapter’s methods are called, it
translates those calls into something the adapted object can understand and
passes the calls on to the adapted object. The code that calls the adapter
never needs to know that it’s not dealing with the kind of object it thinks it is,
but an adapted object instead.
