**Creational Design Patterns:**
* 单例模式 (Singleton Pattern)
* 工厂模式 (Factory Pattern)
* 抽象工厂模式 (Abstract Factory Pattern)
* 建造者模式 (Builder Pattern)
* 原型模式 (Prototype Pattern)
`

**Structural Design Patterns:**
* 适配器模式 (Adapter Pattern)
* 桥接模式 (Bridge Pattern)
* 组合模式 (Composite Pattern)
* 装饰器模式 (Decorator Pattern)
* 外观模式 (Facade Pattern)
* 享元模式 (Flyweight Pattern)
* 代理模式 (Proxy Pattern)

**Behavioral Design Patterns:**
* 责任链模式 (Chain of Responsibility Pattern)
* 命令模式 (Command Pattern)
* 解释器模式 (Interpreter Pattern)
* 迭代器模式 (Iterator Pattern)
* 中介者模式 (Mediator Pattern)
* 备忘录模式 (Memento Pattern)
* 观察者模式 (Observer Pattern)
* 状态模式 (State Pattern)
* 策略模式 (Strategy Pattern)
* 模板方法模式 (Template Method Pattern)
* 访问者模式 (Visitor Pattern)

**Creational Design Patterns:**

* Singleton: Ensures that a class has only one instance and provides a global access point to this instance.
* Factory Method: Defines an interface for creating an object, but lets subclasses decide which class to instantiate.
* Abstract Factory: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
* Builder: Separates the construction of a complex object from its representation, allowing the same construction process to create various representations.
* Prototype: Specifies the kinds of objects to create using a prototyp instance, and creates new objects by copying this prototype.
  
**Structural Design Patterns:**

* Adapter: Converts the interface of a class into another interface clients expect. Allows classes to work together that couldn't otherwise because of incompatible interfaces.
* Bridge: Decouples an abstraction from its implementation, allowing the two to vary independently.
* Composite: Compose objects into tree structures to represent whole-part hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.
* Decorator: Attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
* Facade: Provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.
* Flyweight: Uses sharing to support a large number of objects that have part of their internal state in common, where the other part of state can vary.
* Proxy: Provides a surrogate or placeholder for another object to control access to it.

**Behavioral Design Patterns:**

* Chain of Responsibility: Avoids coupling the sender of a request to its receiver by giving multiple objects a chance to handle the request.
* Command: Encapsulate a request as an object, thereby letting you parametrize clients with different requests, queue or log requests, and support undo-redo.
* Interpreter: Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.
* Iterator: Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
* Mediator: Defines an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.
* Memento: Without violating encapsulation, capture and externalize an object's internal state so that the object can be restored to this state later.
* Observer: Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
* State: Allows an object to alter its behavior when its internal state changes. The object will appear to change its class.
* Strategy: Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
* Template Method: Defines the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
* Visitor: Represents an operation to be performed on elements of an object structure. Visitor lets you define a

![](src\main\resources\images\design_pattern.png)