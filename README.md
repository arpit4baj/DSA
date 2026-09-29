# ⚡ DSA Journey

<p align="center">
  <strong>Learning. Solving. Understanding. Repeating.</strong>
</p>

<p align="center">
  A structured journey through <b>Data Structures & Algorithms</b> using Java, LeetCode, and hands-on problem solving.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>
  <img src="https://img.shields.io/badge/Platform-LeetCode-FFA116?style=for-the-badge&logo=leetcode&logoColor=black"/>
  <img src="https://img.shields.io/badge/Focus-DSA-6C63FF?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Status-Learning-00C853?style=for-the-badge"/>
</p>

---

## 🧠 Why This Repository?

This isn't just a collection of copied solutions.

The goal is to develop the ability to look at a problem and think:

```text
                 PROBLEM
                    │
                    ▼
             Understand it
                    │
                    ▼
             Find the pattern
                    │
                    ▼
             Build an approach
                    │
                    ▼
          ┌─────────┴─────────┐
          ▼                   ▼
      Brute Force          Optimization
          │                   │
          └─────────┬─────────┘
                    ▼
                Code it
                    │
                    ▼
              Test & Analyze
                    │
                    ▼
             Learn the pattern
```

> **The objective is not to memorize solutions — it's to recognize patterns.**

---

# 🗺️ DSA Roadmap

```text
                         DSA
                          │
        ┌─────────────────┼─────────────────┐
        │                 │                 │
      Basics           Data Structures    Algorithms
        │                 │                 │
   ┌────┴────┐       ┌────┴────┐      ┌────┴────┐
   │         │       │         │      │         │
 Arrays   Strings   Linear    Non-   Searching Sorting
                     │       Linear
                     │         │
                ┌────┴───┐ ┌───┴────┐
                │        │ │        │
              Stack    Queue Trees  Graphs
                       │
                    Hashing
                       │
                  HashMap/Set
```

---

# 📚 Topics

### 🟢 Foundations

* [ ] Big-O Notation
* [ ] Arrays
* [ ] Strings
* [ ] Recursion
* [ ] Searching
* [ ] Sorting

### 🔵 Data Structures

* [ ] Linked List
* [ ] Stack
* [ ] Queue
* [ ] Deque
* [ ] Hashing
* [ ] HashMap
* [ ] HashSet
* [ ] Trees
* [ ] Binary Search Tree
* [ ] Heap
* [ ] Trie
* [ ] Graph

### 🟣 Algorithms

* [ ] Binary Search
* [ ] Two Pointers
* [ ] Sliding Window
* [ ] Prefix Sum
* [ ] Divide & Conquer
* [ ] Greedy
* [ ] Backtracking
* [ ] Dynamic Programming
* [ ] Graph Algorithms

---

# 🔥 Problem-Solving Patterns

The most important skill I'm building is **pattern recognition**.

| Pattern                | What to Look For                |
| ---------------------- | ------------------------------- |
| 🔑 HashMap / HashSet   | Fast lookup / frequency         |
| 👥 Two Pointers        | Sorted arrays / pairs           |
| 🪟 Sliding Window      | Contiguous subarray / substring |
| ➕ Prefix Sum           | Repeated range-sum calculations |
| 🔍 Binary Search       | Sorted / monotonic search space |
| 📚 Stack               | Previous/next greater, matching |
| 🌳 DFS / BFS           | Trees and graphs                |
| 🏔️ Heap               | Top K / priority problems       |
| 🔄 Backtracking        | All possible combinations       |
| 🧠 Dynamic Programming | Overlapping subproblems         |

---

# 🧩 LeetCode Progress

### Current Focus → Hashing

|   # | Problem                                        | Pattern              | Status |
| --: | ---------------------------------------------- | -------------------- | :----: |
| 217 | Contains Duplicate                             | HashSet              |    ✅   |
| 242 | Valid Anagram                                  | Frequency            |    ✅   |
| 349 | Intersection of Two Arrays                     | HashSet              |    ✅   |
| 350 | Intersection of Two Arrays II                  | HashMap              |   🔄   |
|   1 | Two Sum                                        | HashMap              |    ⏳   |
|  49 | Group Anagrams                                 | HashMap              |    ⏳   |
| 219 | Contains Duplicate II                          | HashMap              |    ⏳   |
| 347 | Top K Frequent Elements                        | Frequency + Heap     |    ⏳   |
|   3 | Longest Substring Without Repeating Characters | Sliding Window       |    ⏳   |
| 560 | Subarray Sum Equals K                          | Prefix Sum + HashMap |    ⏳   |

> Progress is updated as concepts and problems are completed.

---

# 🧠 My Problem-Solving Framework

For every problem:

### 01 — Understand

What exactly is being asked?

### 02 — Observe

Look for constraints, patterns, and edge cases.

### 03 — Brute Force

Find the simplest correct solution first.

### 04 — Optimize

Ask:

> Can a better data structure or algorithm reduce the complexity?

### 05 — Implement

Write clean and readable Java.

### 06 — Analyze

```text
Time Complexity → ?
Space Complexity → ?
```

### 07 — Reflect

What pattern did this problem teach?

---

# 📊 Complexity Cheat Sheet

| Operation             |    Average |      Worst |
| --------------------- | ---------: | ---------: |
| Array Access          |       O(1) |       O(1) |
| Array Search          |       O(n) |       O(n) |
| HashMap Lookup        |       O(1) |       O(n) |
| HashSet Lookup        |       O(1) |       O(n) |
| Stack Push/Pop        |       O(1) |       O(1) |
| Queue Enqueue/Dequeue |       O(1) |       O(1) |
| Binary Search         |   O(log n) |   O(log n) |
| Merge Sort            | O(n log n) | O(n log n) |
| Heap Insert           |   O(log n) |   O(log n) |
| Heap Delete           |   O(log n) |   O(log n) |

---

# 🏗️ Repository Structure

```text
DSA/
│
├── 📁 01-Arrays
│   ├── Basics
│   ├── Searching
│   ├── Sorting
│   └── LeetCode
│
├── 📁 02-Strings
│   ├── Basics
│   └── LeetCode
│
├── 📁 03-LinkedList
│   ├── Singly
│   ├── Doubly
│   └── LeetCode
│
├── 📁 04-Stack
│
├── 📁 05-Queue
│
├── 📁 06-Hashing
│   ├── HashSet
│   ├── HashMap
│   ├── Collision
│   ├── Frequency
│   └── LeetCode
│
├── 📁 07-Recursion
│
├── 📁 08-Trees
│
├── 📁 09-Heap
│
├── 📁 10-Graphs
│
├── 📁 11-Greedy
│
├── 📁 12-Backtracking
│
└── 📁 13-DynamicProgramming
```

---

# 🧪 Learning Method

Every important problem is approached through:

```text
📌 Problem
   ↓
💡 Hint
   ↓
🧠 Thought Process
   ↓
📝 Approach
   ↓
💻 Implementation
   ↓
🔍 Dry Run
   ↓
⏱️ Complexity
   ↓
🎯 Pattern Learned
```

This makes the repository useful not only for **solving problems**, but also for reviewing concepts later.

---

# 🎯 Goals

```text
☐ Build strong DSA fundamentals
☐ Master common problem-solving patterns
☐ Solve 150+ LeetCode problems
☐ Understand time & space complexity
☐ Improve independent problem solving
☐ Prepare for technical interviews
☐ Write clean and optimized Java
☐ Move from Easy → Medium → Hard
```

---

# 📈 Progress

```text
Easy       ███████░░░  70%
Medium     ███░░░░░░░  30%
Hard       █░░░░░░░░░  10%
```

> Progress bars are updated as the journey continues.

---

# 💻 Tech Stack

<p align="center">

<img src="https://skillicons.dev/icons?i=java,git,github,vscode" />

</p>

---

# 🏆 Milestones

| Milestone             | Status |
| --------------------- | :----: |
| Learn Big-O           |    ⏳   |
| Complete Arrays       |    ⏳   |
| Master Hashing        |   🔄   |
| Master Linked Lists   |    ⏳   |
| Master Trees          |    ⏳   |
| Master Graphs         |    ⏳   |
| Complete 50 LeetCode  |    ⏳   |
| Complete 100 LeetCode |    ⏳   |
| Complete 150 LeetCode |    ⏳   |
| First Hard Problem    |    ⏳   |

---

# 💭 Philosophy

> ### "Don't ask: *How do I solve this problem?*"
>
> ### Ask: *What pattern does this problem belong to?*

Every solved problem should make the **next similar problem easier**.

---

# 📌 Resources

* [LeetCode](https://leetcode.com/)
* [Java Documentation](https://docs.oracle.com/en/java/)
* [Visualgo](https://visualgo.net/)

---

<p align="center">

### ⚡ One Problem. One Pattern. One Step Forward.

**Keep Learning • Keep Solving • Keep Improving**

⭐ Star this repository if you find it useful.

</p>
