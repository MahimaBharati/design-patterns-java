# Observer Pattern

**Definition:**  
The **Observer Pattern** defines a **one-to-many dependency** between objects so that **when one object changes state, all its dependents are notified automatically**.  
It decouples **who produces events** from **who reacts to them**.

**Memory Tip:**

> “The Subject is a *news publisher*, and Observers are *subscribers*. When news comes, everyone subscribed gets notified.”

---

## ❌ Bad Example

In a naive design:

* `YoutubeChannel` exposes its list of subscribers to the client.  
* Client manually loops through subscribers and sends notifications.  
* Any change in notification logic requires modifying both the `YoutubeChannel` and the client.  
* This couples **publisher logic** with **subscriber management**, violating **Open/Closed Principle**.

**Outline:**

```text
Client --> YoutubeChannel (manages subscribers + sends notifications)
```
# ✅ Good Example – Observer Pattern

Introduce a **Subject (Publisher)** and **Observer (Subscriber)** interface:

---

## Subject (Publisher)

* `Channel` → interface with `subscribe`, `unsubscribe`, `uploadVideo`.
* `YoutubeChannel` → concrete implementation, stores subscribers, notifies them on video upload.

---

## Observer (Subscriber)

* `Subscriber` → interface with `update()` (or `notify()`) method.
* `SMSSubscriber`, `EmailSubscriber` → concrete implementations that react to notifications.

---

## Client

* `Main` class subscribes observers to a channel.
* Uploads a video via the channel.
* Subscribers automatically receive notifications without client manually notifying them.

---

## 📊 Outline

```text
Client --> YoutubeChannel (Subject)
             |--> Subscribers (Observers)
                  |--> SMSSubscriber
                  |--> EmailSubscriber
```

---

## ▶️ How to Run

### Files:

* `Main.java`
* `Channel.java`
* `YoutubeChannel.java`
* `Subscriber.java`
* `SMSSubscriber.java`
* `EmailSubscriber.java`

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
Uploading video Recipe for Chana masala to channel: Ammi's kitchen
Hi Mahima! Notification: video Recipe for Chana masala uploaded
Hi mahima@gmail.com! Notification: video Recipe for Chana masala uploaded
```

---

## 🔑 Takeaway

**Good:** Subject handles subscriber notifications → decoupled, flexible, supports multiple observer types.
**Observers** can be added or removed at runtime without changing the subject code.
