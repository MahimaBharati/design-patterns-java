# Abstract Factory Pattern

**Definition:**  
The **Abstract Factory Pattern** provides an **interface to create families of related objects** without specifying their concrete classes.  
The client works only with **abstract factories and abstract products**, not with the concrete implementations.

**Memory Tip:**  
> “Abstract Factory is a factory of factories — it groups related products together.”

---

## ❌ Bad Example

In the bad design:

* The client directly creates `Paytm`, `PhonePe`, `Stripe`, or `PayPal`.
* The client also decides which `Invoice` type (`IndiaInvoice` / `USInvoice`) to create.  
* Adding a new country or payment type requires modifying the client.  
* This couples the client to concrete implementations and violates **Open/Closed Principle**.

**Outline:**
```text
Client --> Paytm / PhonePe / Stripe / PayPal
       --> IndiaInvoice / USInvoice
```
# ✅ Good Example – Abstract Factory Pattern

Introduce an **Abstract Factory** to handle creation of related products:

---

## Abstract Products
- `PaymentGateway` (interface)  
- `Invoice` (interface)

---

## Concrete Products
- `Paytm`, `PhonePe` → implement `PaymentGateway` (India)  
- `Stripe`, `Square` → implement `PaymentGateway` (US)  
- `IndiaInvoice` → implements `Invoice`  
- `USInvoice` → implements `Invoice`  

---

## Abstract Factory
- `RegionFactory` (interface)

---

## Concrete Factories
- `IndiaFactory` → creates Indian `PaymentGateway` + `Invoice`  
- `USFactory` → creates US `PaymentGateway` + `Invoice`

---

## Client
- Uses only `RegionFactory` and product interfaces.  
- Doesn’t care which concrete classes are instantiated.

---

## 📊 Outline
```text
Client --> RegionFactory
             |--> IndiaFactory --> PaymentGateway <-- Paytm
             |                                <-- PhonePe
             |--> IndiaInvoice

             |--> USFactory --> PaymentGateway <-- Stripe
                                           <-- Square
             |--> USInvoice
```

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
Processing payment via Paytm..
Generating India invoice..
Processing payment via Stripe..
Generating US invoice..
```

## 🔑 Takeaway
**Bad:** Client directly creates concrete products (Paytm, Stripe, IndiaInvoice, USInvoice) → tightly coupled, hard to extend, and violates Open/Closed Principle.  
**Good:** Client uses Abstract Factory → works only with factory and abstract products, making the code flexible, maintainable, consistent, and easy to extend with new product families.

