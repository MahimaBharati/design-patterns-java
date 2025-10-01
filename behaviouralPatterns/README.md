# Behavioral Design Patterns

This folder contains examples of **Behavioral Design Patterns** in Java.  
Behavioral patterns deal with **object interaction and responsibility**, focusing on how objects communicate and distribute responsibilities efficiently.  
They help improve flexibility, maintainability, and encapsulate complex control flows.

---

## 📖 Patterns Covered

### 1. Chain of Responsibility

* **Intent**: Pass a request along a chain of handlers until one handles it.
* **Key Idea**: Decouple sender and receiver of a request.
* **Example**: `Logger` chain where messages are handled by `ConsoleLogger`, `FileLogger`, or `ErrorLogger`.

### 2. Command

* **Intent**: Encapsulate a request as an object, allowing parameterization and queuing of requests.
* **Key Idea**: Separate the object that invokes an operation from the one that knows how to perform it.
* **Example**: `LightOnCommand` and `LightOffCommand` executed by a `RemoteControl`.

### 3. Interpreter

* **Intent**: Define a representation for a grammar and an interpreter to evaluate sentences in that language.
* **Key Idea**: Convert text or expressions into actions.
* **Example**: `Expression` classes to interpret a simple language for evaluating math expressions.

### 4. Iterator

* **Intent**: Provide a way to access elements of a collection sequentially without exposing its underlying representation.
* **Key Idea**: Decouple traversal logic from the collection.
* **Example**: `PlaylistIterator` traversing a `Playlist` of `Video` objects.

### 5. Mediator

* **Intent**: Define an object that encapsulates how a set of objects interact.
* **Key Idea**: Promote loose coupling by preventing objects from referring to each other explicitly.
* **Example**: `ChatRoomMediator` coordinating messages between `User` objects.

### 6. Memento

* **Intent**: Capture and restore an object’s internal state without violating encapsulation.
* **Key Idea**: Preserve object state for undo/redo functionality.
* **Example**: `Editor` saves `Document` states to allow undo.

### 7. Observer

* **Intent**: Define a one-to-many dependency between objects so that when one changes, all its dependents are notified.
* **Key Idea**: Promote low coupling between subject and observers.
* **Example**: `WeatherStation` notifies `Display` elements of temperature changes.

### 8. State

* **Intent**: Allow an object to alter its behavior when its internal state changes.
* **Key Idea**: Encapsulate state-specific behavior in separate classes.
* **Example**: `GumballMachine` with `SoldOutState`, `NoQuarterState`, `HasQuarterState`.

### 9. Strategy

* **Intent**: Define a family of algorithms, encapsulate each one, and make them interchangeable.
* **Key Idea**: Clients can choose the algorithm at runtime.
* **Example**: `RidingService` using `AirportQueue`, `Nearest`, or `Surge` strategies.

### 10. Template Method

* **Intent**: Define the skeleton of an algorithm in a method, deferring some steps to subclasses.
* **Key Idea**: Allow subclasses to redefine certain steps without changing the overall algorithm.
* **Example**: `Game` class defines `play()` and subclasses override `initialize()`, `startPlay()`, `endPlay()`.

### 11. Visitor

* **Intent**: Represent an operation to be performed on elements of an object structure.
* **Key Idea**: Separate algorithms from the objects on which they operate.
* **Example**: `ShoppingCartVisitor` calculates total cost for `Book` and `Fruit` items.

---

## 🧩 How to Remember (Sutra)

> **Chain passes, Command encapsulates, Interpreter evaluates, Iterator traverses, Mediator coordinates, Memento saves, Observer notifies, State switches, Strategy varies, Template defines, Visitor visits.**
