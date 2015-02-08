# Design-Patterns
A working example of most of the GoF design patterns in Java

Strategy Pattern
</hr>

The Design Patterns authors define the Strategy pattern as:

Define a family of algorithms, encapsulate each one, and make them interchangeable. [The] Strategy [pattern] lets the algorithm vary independently from clients that use it.
The Strategy pattern lets you build software as a loosely coupled collection of interchangeable parts, in contrast to a monolithic, tightly coupled system. That loose coupling makes your software much more extensible, maintainable, and reusable.

Taken from http://www.javaworld.com/article/2074195/swing-gui-programming/strategy-for-success.html

Decorator Pattern

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
