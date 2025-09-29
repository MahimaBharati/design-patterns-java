# Structural Design Patterns

This folder contains examples of **Structural Design Patterns** in Java.
Structural patterns deal with the **composition of classes and objects**, focusing on how to form larger structures while keeping the system **flexible and efficient**.
They help ensure that if one part of a system changes, the entire structure doesn’t break.

---

## 📖 Patterns Covered

### 1. Adapter

* **Intent**: Convert the interface of a class into another interface the client expects.
* **Key Idea**: Acts as a bridge between incompatible interfaces.
* **Example**: `PaytmAdapter` adapts `Paytm` to work with `PaymentGateway`.

### 2. Bridge

* **Intent**: Decouple an abstraction from its implementation so the two can vary independently.
* **Key Idea**: Separate **what** is done from **how** it is done.
* **Example**: `RemoteControl` abstraction working with different `Device` implementations (`TV`, `Radio`).

### 3. Composite

* **Intent**: Compose objects into tree structures to represent part-whole hierarchies.
* **Key Idea**: Treat individual objects and compositions uniformly.
* **Example**: `File` and `Directory` objects both implement `FileSystemComponent`.

### 4. Decorator

* **Intent**: Attach additional responsibilities to an object dynamically.
* **Key Idea**: Provides a flexible alternative to subclassing for extending behavior.
* **Example**: `Coffee` can be wrapped with decorators like `MilkDecorator` or `SugarDecorator`.

### 5. Facade

* **Intent**: Provide a unified interface to a set of interfaces in a subsystem.
* **Key Idea**: Simplifies usage by offering a high-level interface.
* **Example**: `HomeTheaterFacade` that controls `Amplifier`, `DVDPlayer`, `Projector` in one call.

### 6. Flyweight

* **Intent**: Use sharing to support large numbers of fine-grained objects efficiently.
* **Key Idea**: Reuse common parts instead of creating duplicates.
* **Example**: `CharacterFlyweightFactory` reuses character objects in a text editor.

### 7. Proxy

* **Intent**: Provide a surrogate or placeholder for another object to control access to it.
* **Key Idea**: Stand-in object adds control, protection, or lazy loading.
* **Example**: `ImageProxy` that loads images on demand.

---

## 🧩 How to Remember (Sutra)

> **Adapter bridges, Bridge separates, Composite unifies, Decorator wraps, Facade simplifies, Flyweight shares, Proxy controls.**