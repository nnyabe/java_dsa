# Data Structures in Java

This directory contains implementations of fundamental data structures in Java. The data structures are implemented with the goal of demonstrating their usage and internal workings. Each data structure is provided in its own Java file for clarity and ease of understanding.

## Table of Contents

- [Linked List](#linked-list)
- [Stack](#stack)
- [Queue](#queue)
- [Binary Tree](#binary-tree)
- [Usage](#usage)

## Linked List

A **Linked List** is a linear data structure in which elements (nodes) are stored in a non-contiguous manner. Each node contains a value and a reference (or pointer) to the next node in the sequence. Linked lists can be singly linked (each node points to the next) or doubly linked (each node points both to the next and the previous node).

- **Singly Linked List**: Each node contains a value and a pointer to the next node.
- **Doubly Linked List**: Each node contains a value and pointers to both the next and previous nodes.

### File(s)
- [`SinglyLinkedList.java`](LinkedList/SinglyLinkedList.java)
- [`DoublyLinkedList.java`](LinkedList/DoublyLinkedList.java)

### Operations:
- **Insertion**: Add elements at the beginning, end, or at a specific position.
- **Deletion**: Remove elements from the beginning, end, or from a specific position.
- **Traversal**: Access each element of the linked list.
- **Search**: Find an element in the list.

---

## Stack

A **Stack** is a linear data structure that follows the **Last In, First Out** (LIFO) principle. The last element added to the stack is the first one to be removed. Stacks are often used in scenarios where you need to reverse or backtrack operations.

### File(s)
- [`Stack.java`](Stack/Stack.java)

### Operations:
- **Push**: Add an element to the top of the stack.
- **Pop**: Remove the top element from the stack.
- **Peek**: View the top element without removing it.
- **isEmpty**: Check if the stack is empty.

---

## Queue

A **Queue** is a linear data structure that follows the **First In, First Out** (FIFO) principle. The first element added to the queue is the first one to be removed. Queues are often used in scheduling, buffering, or processing tasks in a sequential order.

### File(s)
- [`Queue.java`](Queue/Queue.java)

### Operations:
- **Enqueue**: Add an element to the rear of the queue.
- **Dequeue**: Remove an element from the front of the queue.
- **Peek**: View the front element without removing it.
- **isEmpty**: Check if the queue is empty.

---

## Binary Tree

A **Binary Tree** is a hierarchical data structure in which each node has at most two children, referred to as the left child and the right child. Binary trees are used in many applications, including searching, sorting, and decision-making.

### File(s)
- [`BinaryTree.java`](BinaryTree/BinaryTree.java)

### Operations:
- **Insertion**: Add a node to the tree.
- **Deletion**: Remove a node from the tree.
- **Traversal**: Visit each node in a specific order (in-order, pre-order, post-order).
- **Search**: Find a node in the tree.

### Types of Binary Trees:
- **Full Binary Tree**: Every node has either 0 or 2 children.
- **Complete Binary Tree**: Every level is filled except possibly the last, which is filled from left to right.
- **Balanced Binary Tree**: The left and right subtrees of every node differ in height by at most one.
- **Binary Search Tree (BST)**: A binary tree where each node follows the property that all nodes in the left subtree have lesser values and all nodes in the right subtree have greater values.

---

## Usage

To use any of the data structures in this directory, you can simply compile and run the corresponding Java files. Each file includes methods for performing common operations such as insertion, deletion, traversal, and searching.

### Example: Using the Stack

1. Navigate to the directory where `Stack.java` is located.
2. Compile the Java file:
   ```bash
   javac Stack.java
