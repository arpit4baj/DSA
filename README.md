# ⚡ DSA × JAVA

### `Think → Code → Break → Optimize → Repeat`

> **A structured journey through Data Structures & Algorithms — built in Java, one problem at a time.**

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=openjdk&logoColor=white"/>
  <img src="https://img.shields.io/badge/Focus-DSA-blue?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Problems-Solving-success?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Status-🟢%20Active-brightgreen?style=for-the-badge"/>
</p>

---

## 🧠 What is this?

This repository is my **DSA laboratory in Java**.

Not just a collection of solutions.

Every problem follows the same cycle:

```text
              ┌───────────────┐
              │   Understand  │
              └───────┬───────┘
                      ↓
              ┌───────────────┐
              │    Approach   │
              └───────┬───────┘
                      ↓
              ┌───────────────┐
              │     Code      │
              └───────┬───────┘
                      ↓
              ┌───────────────┐
              │    Analyze    │
              │  Time/Space   │
              └───────┬───────┘
                      ↓
              ┌───────────────┐
              │   Optimize    │
              └───────┬───────┘
                      ↓
                   🚀 NEXT
```

The goal isn't to memorize solutions.

**The goal is to build problem-solving instincts.**

---

# 🗺️ DSA ROADMAP

```text
                    🧩 DSA
                      │
        ┌─────────────┼─────────────┐
        ↓             ↓             ↓
     LINEAR        NON-LINEAR    ALGORITHMS
        │             │             │
   ┌────┼────┐    ┌───┼────┐    ┌───┼────┐
   ↓    ↓    ↓    ↓   ↓    ↓    ↓   ↓    ↓
 Array Linked Stack Tree Graph Sort Search DP
       List  Queue
```

### 🟢 Foundations

* [ ] Java Basics
* [ ] Input / Output
* [ ] Functions
* [ ] Recursion
* [ ] Complexity Analysis
* [ ] Bit Manipulation

### 🔵 Linear Data Structures

* [ ] Arrays
* [ ] Strings
* [ ] Linked List
* [ ] Stack
* [ ] Queue
* [ ] Deque
* [ ] Hashing

### 🟣 Non-Linear Data Structures

* [ ] Trees
* [ ] Binary Tree
* [ ] BST
* [ ] AVL Tree
* [ ] Heap
* [ ] Priority Queue
* [ ] Trie
* [ ] Graph
* [ ] Disjoint Set Union

### 🟠 Algorithms

* [ ] Searching
* [ ] Sorting
* [ ] Two Pointers
* [ ] Sliding Window
* [ ] Prefix Sum
* [ ] Recursion
* [ ] Backtracking
* [ ] Greedy
* [ ] Divide & Conquer
* [ ] Dynamic Programming

### 🔴 Advanced

* [ ] Graph Algorithms
* [ ] Shortest Path
* [ ] Minimum Spanning Tree
* [ ] Topological Sorting
* [ ] Advanced DP
* [ ] Segment Tree
* [ ] Fenwick Tree

---

# 📂 Repository Architecture

```text
DSA-JAVA/
│
├── 📁 01-Arrays/
│   ├── TwoSum.java
│   ├── KadaneAlgorithm.java
│   └── RotateArray.java
│
├── 📁 02-Strings/
│   ├── Palindrome.java
│   ├── Anagram.java
│   └── LongestSubstring.java
│
├── 📁 03-LinkedList/
│   ├── SinglyLinkedList.java
│   ├── DoublyLinkedList.java
│   └── ReverseLinkedList.java
│
├── 📁 04-Stack/
│
├── 📁 05-Queue/
│
├── 📁 06-Hashing/
│
├── 📁 07-Trees/
│   ├── BinaryTree/
│   ├── BST/
│   └── AVL/
│
├── 📁 08-Heap/
│
├── 📁 09-Graph/
│
├── 📁 10-Sorting/
│
├── 📁 11-Searching/
│
├── 📁 12-Recursion/
│
├── 📁 13-Backtracking/
│
├── 📁 14-Greedy/
│
├── 📁 15-DynamicProgramming/
│
└── 📄 README.md
```

---

# ⚙️ How I Analyze Every Problem

Each solution follows a consistent template:

```java
/*
    Problem:
    --------------------------------
    <Problem statement>

    Approach:
    --------------------------------
    <Logic>

    Time Complexity:
    O(...)

    Space Complexity:
    O(...)
*/
```

### Example

```java
public int maxSubArray(int[] nums) {

    int current = nums[0];
    int maximum = nums[0];

    for (int i = 1; i < nums.length; i++) {

        current = Math.max(nums[i], current + nums[i]);

        maximum = Math.max(maximum, current);
    }

    return maximum;
}
```

**Pattern discovered:** Kadane's Algorithm

```text
Problem
   ↓
Observe
   ↓
Find Pattern
   ↓
Implement
   ↓
Optimize
```

---

# 🧩 PATTERN LIBRARY

Instead of remembering hundreds of problems, I focus on recognizing patterns.

| Pattern                | Typical Problems        |
| ---------------------- | ----------------------- |
| 🔹 Two Pointers        | Pair Sum, Palindrome    |
| 🔹 Sliding Window      | Subarray / Substring    |
| 🔹 Hashing             | Frequency / Lookup      |
| 🔹 Binary Search       | Sorted Search Space     |
| 🔹 Fast & Slow Pointer | Linked List             |
| 🔹 Monotonic Stack     | Next Greater Element    |
| 🔹 BFS                 | Level Traversal         |
| 🔹 DFS                 | Graph / Tree Traversal  |
| 🔹 Backtracking        | Permutations / N-Queens |
| 🔹 Greedy              | Local Optimal Choices   |
| 🔹 Dynamic Programming | Overlapping Subproblems |
| 🔹 Divide & Conquer    | Merge Sort              |
| 🔹 Union Find          | Connected Components    |

> **The real skill isn't solving Problem #347.
> It's recognizing that Problem #347 is another version of a pattern you've already learned.**

---

# 📊 COMPLEXITY CHEAT SHEET

| Data Structure / Algorithm |      Average |        Worst |
| -------------------------- | -----------: | -----------: |
| Array Access               |       `O(1)` |       `O(1)` |
| Array Search               |       `O(n)` |       `O(n)` |
| Binary Search              |   `O(log n)` |   `O(log n)` |
| HashMap Search             |       `O(1)` |       `O(n)` |
| Stack Push                 |       `O(1)` |       `O(1)` |
| Queue Enqueue              |       `O(1)` |       `O(1)` |
| BST Search                 |   `O(log n)` |       `O(n)` |
| Heap Insert                |   `O(log n)` |   `O(log n)` |
| Merge Sort                 | `O(n log n)` | `O(n log n)` |
| Quick Sort                 | `O(n log n)` |      `O(n²)` |

---

# ☕ JAVA TOOLKIT

This repository also focuses on becoming comfortable with Java's built-in DSA tools.

### Collections

```java
ArrayList
LinkedList
HashMap
HashSet
TreeMap
TreeSet
Stack
Queue
Deque
PriorityQueue
```

### Useful Concepts

```text
Comparable
Comparator
Generics
Iterators
Lambda Expressions
Streams
Custom Classes
Custom Data Structures
```

---

# 🎯 PROBLEM-SOLVING WORKFLOW

When I face a new problem:

```text
             READ
               ↓
        What is given?
               ↓
        What is required?
               ↓
       ┌───────────────┐
       │ Find Pattern  │
       └───────┬───────┘
               ↓
        Brute Force
               ↓
        Optimize Logic
               ↓
       Time Complexity
               ↓
       Space Complexity
               ↓
            CODE
               ↓
            TEST
               ↓
           OPTIMIZE
```

---

# 🏆 PROGRESS TRACKER

### Data Structures

```text
Arrays          ██████████░░  80%
Strings         ████████░░░░  65%
Linked List     ███████░░░░░  60%
Stack           ██████░░░░░░  50%
Queue           █████░░░░░░░  45%
Hashing         ███████░░░░░  60%
Trees           █████░░░░░░░  45%
Graphs          ███░░░░░░░░░  25%
```

### Algorithms

```text
Searching       ████████░░░░
Sorting         ███████░░░░░
Recursion       ██████░░░░░░
Backtracking    ████░░░░░░░░
Greedy          ████░░░░░░░░
Dynamic Prog.   ██░░░░░░░░░░
```

> Progress bars are updated as the repository grows.

---

# 🧪 FROM BRUTE FORCE → OPTIMIZED

One of the main goals of this repository is learning how to improve solutions.

```text
                 BRUTE FORCE
                      │
                      ↓
                 O(n²)
                      │
                 Find Bottleneck
                      │
                      ↓
                Better Approach
                      │
                      ↓
                  O(n log n)
                      │
                 Find Pattern
                      │
                      ↓
                OPTIMIZED
                      │
                      ↓
                   O(n)
```

The important question isn't:

> **"Can I solve this?"**

It's:

> **"Can I solve this with fewer operations and less memory?"**

---

# 💡 WHAT I'M LEARNING

```text
❌ Memorizing solutions

        ↓

✅ Understanding patterns

        ↓

❌ Writing code that works

        ↓

✅ Writing efficient code

        ↓

❌ Solving one problem

        ↓

✅ Recognizing 20 problems as one pattern
```

---

# 🚀 GOALS

* [ ] Build strong DSA fundamentals
* [ ] Master Java Collections
* [ ] Recognize common problem patterns
* [ ] Improve time & space complexity
* [ ] Solve medium-level problems confidently
* [ ] Tackle hard problems systematically
* [ ] Build custom data structures from scratch
* [ ] Prepare for technical interviews
* [ ] Become a better problem solver

---

# 🧠 THE GOLDEN RULE

```text
                 ┌──────────────────────┐
                 │      DON'T           │
                 │   MEMORIZE CODE      │
                 └──────────┬───────────┘
                            ↓
                 ┌──────────────────────┐
                 │    UNDERSTAND WHY    │
                 └──────────┬───────────┘
                            ↓
                 ┌──────────────────────┐
                 │   RECOGNIZE PATTERN  │
                 └──────────┬───────────┘
                            ↓
                 ┌──────────────────────┐
                 │    WRITE YOUR OWN    │
                 │        SOLUTION      │
                 └──────────┬───────────┘
                            ↓
                         🚀 GROW
```

---

# 🛠️ Tech Stack

<p align="center">

<img src="https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>

<img src="https://img.shields.io/badge/DSA-Algorithms-blue?style=for-the-badge"/>

<img src="https://img.shields.io/badge/Git-Version%20Control-F05032?style=for-the-badge&logo=git&logoColor=white"/>

</p>

---

# 🌱 Repository Philosophy

> **Code is the implementation.
> The real product is the thinking behind it.**

Every problem added here should answer three questions:

```text
1️⃣ Why does this solution work?

2️⃣ Why is it efficient?

3️⃣ Can the same idea solve another problem?
```

If the answer to all three is **yes**, the problem is truly learned.

---

# ⭐ If You Find This Useful

Feel free to:

```text
⭐ Star
🍴 Fork
💡 Suggest improvements
🐛 Report issues
🤝 Contribute
```

---

<div align="center">

### ⚡ One Problem. One Pattern. One Step Forward.

**`Think Better → Code Better → Solve Better`**

</div>
