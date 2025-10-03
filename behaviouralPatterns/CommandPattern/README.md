# Command Pattern

**Definition:**  
The **Command Pattern** turns a request into a stand-alone object (`Command`) that contains all the information about the action to perform.  
This allows you to **decouple the invoker (Remote Control)** from the **receiver (Light, AC, etc.)**.  

**Memory Tip:**  

> “Command is like a *universal remote control*: buttons don’t know what devices do, they just trigger commands.”

---

## ❌ Bad Example

In the bad design (`NaiveRemoteControl`):

* The remote knows too much about receivers (`Light`, `AC`) and their methods.  
* Undo logic is hardcoded with `switch` statements.  
* Adding a new device (e.g., `Fan`) requires modifying the remote → violates **Open/Closed Principle**.  
* Remote becomes bloated with too many direct dependencies.

**Outline:**

```text
Client --> NaiveRemoteControl (knows Light + AC + undo logic)
Light  --> executes actions
AC     --> executes actions
```
# ✅ Good Example – Command Pattern

This example demonstrates how to use the **Command Pattern** to decouple the invoker (`RemoteControl`) from the receivers (`Light`, `AC`).  
Each action (ON/OFF) is encapsulated in its own command object, supporting flexible undo operations.

---

## 📂 Files

* `Command.java` – Command interface (`execute`, `undo`)  
* `Light.java` – Receiver class for Light  
* `AC.java` – Receiver class for AC  
* `LightOn.java`, `LightOff.java` – Concrete commands for Light  
* `ACOn.java`, `ACOff.java` – Concrete commands for AC  
* `RemoteControl.java` – Invoker that triggers commands and maintains undo history  
* `Main.java` – Client that configures and uses the remote  

---

## ▶️ How to Run

### Compile
```bash
javac *.java
```
### Run:

```bash
java Main
```
# ▶️ Expected Output – Command Pattern

```text
Light is ON
Light is OFF
AC is ON
AC is OFF
```
# 🔑 Takeaway – Command Pattern

* Remote (`Invoker`) doesn’t need to know device details.  
* Commands encapsulate actions and support undo.  
* New devices/commands can be added without modifying existing code → **Open/Closed Principle**.  
