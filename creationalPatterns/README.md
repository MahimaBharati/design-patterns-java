# Creational Design Patterns

This folder contains examples of **Creational Design Patterns** in Java.  
Creational patterns deal with **object creation mechanisms**, trying to create objects in a manner suitable to the situation. They abstract the instantiation process and make the system more independent of how its objects are created, composed, and represented.

---

## 📖 Patterns Covered

### 1. Factory Method
- **Intent**: Define an interface for creating objects, but let subclasses decide which class to instantiate.  
- **Key Idea**: Delegates instantiation logic to child classes.
- **Example**: `NotificationFactory` that creates `EmailNotification` or `SMSNotification` objects.

### 2. Abstract Factory
- **Intent**: Provide an interface for creating families of related or dependent objects without specifying their concrete classes.  
- **Key Idea**: Groups factories for different product families.
- **Example**: `IndiaFactory` that provides both `PaymentGateway` and `Invoice` objects (`Paytm`, `PhonePe`, etc.).

### 3. Builder
- **Intent**: Separate the construction of a complex object from its representation so that the same construction process can create different representations.  
- **Key Idea**: Step-by-step construction.


### 4. Prototype
- **Intent**: Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.  
- **Key Idea**: Clone existing objects instead of creating new ones from scratch.

### 5. Singleton
- **Intent**: Ensure a class has only one instance and provide a global point of access to it.  
- **Key Idea**: Private constructor + static instance.

---

## 🧩 How to Remember (Sutra)

> **Factory makes, Abstract Factory groups, Builder constructs step-by-step, Prototype copies, Singleton restricts.**
