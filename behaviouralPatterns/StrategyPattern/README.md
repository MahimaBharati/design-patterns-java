# Strategy Pattern

**Definition:**  
The **Strategy Pattern** defines a family of algorithms, encapsulates each one, and makes them interchangeable.  
The client can choose the algorithm (strategy) at runtime, without changing the client code.

**Memory Tip:**

> “Strategy is like choosing a route in Google Maps — the destination is fixed, but you can switch between driving, walking, or cycling strategies.”

---

## ❌ Bad Example

In the bad design:

* The `RidingService` class directly contains the logic for airport queue, nearest ride, and surge pricing inside `if-else` or `switch`.
* If we want to add another ride-matching algorithm, we must modify `RidingService`.
* This couples the **service** with **all strategies**, violating **Single Responsibility Principle** and **Open/Closed Principle**.
* The client cannot easily switch between algorithms at runtime.

**Outline:**

```text
Client --> RidingService (handles ride + all algorithms together)
```
# ✅ Good Example – Strategy Pattern

Introduce a **RidingStrategy interface** and make each strategy a separate class.  
The `RidingService` delegates ride matching to the chosen strategy.

---

## Strategy

* `RidingStrategy` → defines the contract `match(String location)`.

```java
public interface RidingStrategy {
    void match(String location);
}
## Concrete Strategies

* `AirportQueue` → matches rides for airport pickup.  
* `Nearest` → matches the nearest available ride.  
* `Surge` → matches rides with surge pricing.

## Context

* `RidingService` → accepts a `RidingStrategy` via constructor.  
* The service delegates the matching to the strategy.  
* The client can pick which strategy to use without modifying the service.
## 📊 Outline

```text
Client --> RidingService --> RidingStrategy
                               |--> AirportQueue
                               |--> Nearest
                               |--> Surge
```
## ▶️ How to Run

### Files:

* `Main.java`  
* `RidingService.java`  
* `RidingStrategy.java`  
* `AirportQueue.java`  
* `Nearest.java`  
* `Surge.java`  

### Compile:

```bash
javac *.java
```

### Run:

```bash
java Main
```

### Expected Output:
```text
Using strategy airport queue for matching to location M.G.Road
Using strategy nearest ride for matching to location Lalbagh Gardens
Using strategy surge pricing for matching to location Lalbagh Gardens
```
---

## 🔑 Takeaway

**Bad:** Service and client directly control ride-matching logic → tight coupling, no flexibility.
**Good:** Strategy is separated from the service → supports multiple algorithms, cleaner code, reusable and extensible. The client doesn’t need to know how rides are matched, only which strategy to apply.