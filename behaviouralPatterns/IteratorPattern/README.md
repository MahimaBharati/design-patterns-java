# Iterator Pattern

**Definition:**
The **Iterator Pattern** provides a way to **sequentially access elements of a collection** without exposing its underlying representation (array, list, tree, etc.).
It decouples **how a collection is stored** from **how it is traversed**.

**Memory Tip:**

> “Iterator is a *remote control* for your collection — lets you move through items without touching its internals.”

---

## ❌ Bad Example

In the bad design:

* The `Playlist` class exposes its internal list and traversal logic.
* The client directly loops with `position` and `videos.get(i)`.
* If we want multiple traversals (reverse order, skipping items), we must modify `Playlist`.
* This couples **data storage** with **traversal strategy**, violating **Single Responsibility Principle**.

**Outline:**

```text
Client --> Playlist (manages videos + traversal logic)
```

---

# ✅ Good Example – Iterator Pattern

Introduce a **separate Iterator** object to handle traversal:

---

## Aggregate (Collection)

* `Playlist` → stores `Video` objects.
* Provides `iterator()` method that returns an `Iterator<Video>`.

---

## Iterator

* `PlaylistIterator` → traverses through the playlist.

---

## Element

* `Video` → represents a single video with a `title`.

---

## Client

* Asks the `Playlist` for an `Iterator`.
* Uses only the `Iterator` interface (`hasNext()`, `next()`).
* Doesn’t care how the `Playlist` stores videos internally.

---

## 📊 Outline

```text
Client --> Iterator
             |--> PlaylistIterator (forward traversal)

Playlist --> stores Videos
Video   --> element
```

---

## ▶️ How to Run

### Files:

* `Main.java`
* `Playlist.java`
* `PlaylistIterator.java`
* `Video.java`

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
Iterator Pattern
Adapter Pattern
factoryy Pattern
```

---

## 🔑 Takeaway

**Bad:** Client or collection controls iteration logic → tight coupling, no flexibility.
**Good:** Iterator is separated from the collection → supports multiple traversal strategies, cleaner code, reusable and extensible.
The client doesn’t need to know **how** data is stored, only how to use the iterator.
