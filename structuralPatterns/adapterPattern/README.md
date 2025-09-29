# Adapter Pattern – Payment Gateway Example

**Definition:**
The **Adapter Pattern** allows objects with incompatible interfaces to work together.
It acts as a **bridge** between the client and a class with a different interface.

**Memory Tip:**

> “Adapter converts one interface into another the client expects.”

---

## ❌ Bad Example

In the bad design:

* The `CheckoutService` works only with `PaymentGateway` interface.
* `PhonePe` implements `PaymentGateway`, but `Paytm` has a **different interface** (e.g., `makePayment()` instead of `pay()`).
* Without adaptation, the client cannot use `Paytm` inside `CheckoutService`.
* This couples the client to specific implementations and breaks flexibility.

**Outline:**

```text
Client --> CheckoutService --> PaymentGateway
                          X--> Paytm (incompatible)
```

---

# ✅ Good Example – Adapter Pattern

Introduce an **Adapter** that makes `Paytm` compatible with `PaymentGateway`.

---

## Target Interface

* `PaymentGateway` – expected by `CheckoutService`.

---

## Adaptee (Incompatible Class)

* `Paytm` – has its own method (e.g., `pay()`).

---

## Adapter

* `PaytmAdapter` – implements `PaymentGateway` and internally calls `Paytm.pay()`.

---

## Client

* Uses only `PaymentGateway` and `CheckoutService`.
* Works with both `PhonePe` and `Paytm` (via adapter).
* Client doesn’t care about the incompatibility.

---

## 📊 Outline

```text
Client --> CheckoutService --> PaymentGateway
                                |--> PhonePe (direct)
                                |--> PaytmAdapter --> Paytm
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
Processing payment of 1000 via PhonePe
Processing payment of 10000 via Paytm
```

---

## 🔑 Takeaway

**Bad:** Client cannot reuse existing `Paytm` class because its interface doesn’t match → duplicate code or rewriting needed.
**Good:** Adapter makes incompatible classes work together without modifying them → promotes reuse, flexibility, and maintainability.
