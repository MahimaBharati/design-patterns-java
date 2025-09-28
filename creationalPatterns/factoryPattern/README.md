# Factory Pattern
**Definition:**  
A **Factory Pattern** provides **an interface for creating objects** but lets another class decide **which concrete class to instantiate.** Client code should **depend only on abstractions**, not concrete classes.

**Memory Tip:**  
> “You ask the factory for a product; you don’t care how it’s made.”

---

## ❌ Bad Example

In the bad design:

* The client decides which concrete class to create.
* Adding new types requires modifying the client.
* Violates **Open/Closed Principle** and couples client to concrete implementations.

**Outline:**
```text
Client --> EmailNotification / SMSNotification
```
## ✅ Good Example

Introduce a Factory that handles object creation:

* Notification → interface for all notifications.
* EmailNotification, SMSNotification → implement Notification.
* NotificationFactory → decides which concrete Notification to create.
* NotificationService → uses the factory to send notifications; client interacts only with the service.
* Client depends only on NotificationService, never on concrete notifications or the factory.

**Outline:**
```text
Client --> NotificationService --> NotificationFactory -->Notification
                                                        <--EmailNotification
                                                        <-- SMSNotification

```

### Benefits

* Client doesn’t need to know concrete classes.
* Adding new types requires changing only the factory, not the client.
* Promotes loose coupling and adheres to Open/Closed Principle.
* Centralizes object creation → easier to maintain.

1. Compile all classes:

```bash
javac *.java
```

2. Run the program:

```bash
java Main
```

3. Expected Output:
Sending Email notification...
Sending SMS notification...

## 🔑 Takeaway
**Bad:** Client directly creates concrete classes → fragile and hard to extend.
**Good:** Client asks the factory for objects → flexible, maintainable, and testable.