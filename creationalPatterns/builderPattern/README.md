# Builder Pattern – Smoothie Example

**Definition:**
The **Builder Pattern** separates the construction of a complex object from its representation. It allows creating objects step by step, especially when they have many optional parameters.
The client works only with the **Builder class** and the **Smoothie object**, not with multiple constructors or complex parameter lists.

**Memory Tip:**

> “Builder lets you construct step by step, adding optional features without messy constructors.”

---

## ❌ Bad Example

In the bad design:

* The client directly calls the `Smoothie` constructor with all parameters.
* Optional parameters often have to be `null` or require many constructor overloads.
* Adding a new optional field requires modifying all constructors.
* This couples the client to the concrete class and makes the code hard to read and maintain.

**Outline:**

```text
Client --> Smoothie(base, size, fruits, proteinPowder, seeds, sweetener, toppings)
```

---

# ✅ Good Example – Builder Pattern

Introduce a **Builder** to handle optional parameters:

---

## Abstract Products (Optional Fields)

* `fruits` (List<String>)
* `proteinPowder` (Boolean)
* `seeds` (List<String>)
* `sweetener` (String)
* `toppings` (List<String>)

---

## Concrete Product

* `Smoothie` class with mandatory fields: `base`, `size`
* Built via `SmoothieBuilder`

---

## Builder Class

* `Smoothie.SmoothieBuilder` (static nested class)
* Chainable setter methods for optional fields (`withFruits()`, `withProteinPowder()`, etc.)
* `build()` method returns the final `Smoothie` object

---

## Client

* Uses only `SmoothieBuilder` and the `Smoothie` object
* Doesn’t directly call `Smoothie` constructors with all fields

---

## 📊 Outline

```text
Client --> SmoothieBuilder
             |--> set mandatory fields (base, size)
             |--> optional fields: fruits, proteinPowder, seeds, sweetener, toppings
             |--> build() --> Smoothie object
```

---

# ▶️ How to Run

1. Compile all classes:

```bash
javac *.java
```

2. Run the program:

```bash
java Main
```

3. Expected Output:

```text
(Since Smoothie class has no print statements, add toString() to see the object)
Smoothie{base='Milk', size='Medium', fruits=[], proteinPowder=false, seeds=[], sweetener=null, toppings=[]}
```

---

## 🔑 Takeaway

**Bad:** Client directly creates objects with many parameters → tightly coupled, hard to maintain, error-prone.
**Good:** Client uses Builder → constructs objects step by step, handles optional fields clearly, and the code is flexible, maintainable, and easy to extend.
