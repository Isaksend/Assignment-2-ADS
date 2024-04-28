# Assignment-2-ADS
# Overview
This GitHub repository contains implementations of various fundamental data structures in Java. These include array lists, linked lists, stacks, queues, and min heaps. Each data structure is generic and designed to provide a practical understanding of its operations and internal mechanics.

Data Structures Implemented
1. MyArrayList
A dynamic array implementation that automatically resizes as elements are added. It supports a variety of operations to manipulate the elements stored.

Key Features:
Add, remove, and access elements by index
Supports automatic resizing for efficient space management
Implementation of the MyList interface with methods like addFirst, addLast, and sort
2. MyLinkedList
A doubly linked list that allows sequential access and modifications at both ends. It supports operations typical of a linked list, such as element insertion and removal at specified positions.

Key Features:
Add, set, and remove elements at specific indexes
Efficiently add and remove elements at the start and end of the list
Custom sorting method implementing a simple bubble sort
3. MyStack
A stack data structure implementing the Last In, First Out (LIFO) principle. It is backed by the MyArrayList for dynamic array handling.

Key Features:
Push to add elements to the top of the stack
Pop to remove and return the top element of the stack
Peek to view the top element without removal
4. MyQueue
A queue data structure implementing the First In, First Out (FIFO) principle. It utilizes MyLinkedList to manage elements.

Key Features:
Enqueue to add elements to the end of the queue
Dequeue to remove and return the first element of the queue
Peek to view the first element without removing it
5. MyMinHeap
A minimum heap that provides efficient access to the smallest element, very useful for priority queue implementations.

Key Features:
Add elements while maintaining the heap property
Poll to remove and return the smallest element
Peek to view the smallest element without removal
Getting Started
To use these data structures in your Java projects, include the respective Java files in your project directory and ensure your project is set up to compile Java code.


# Examples:

// Example of using MyArrayList
MyArrayList<Integer> arrayList = new MyArrayList<>();
arrayList.add(1);
arrayList.add(2);
arrayList.sort();
System.out.println(arrayList.get(0));  // Output will be sorted elements

// Example of using MyLinkedList
MyLinkedList<String> linkedList = new MyLinkedList<>();
linkedList.addFirst("Hello");
linkedList.addLast("World");
System.out.println(linkedList.getFirst());  // Output: Hello

// Example of using MyStack
MyStack<Double> stack = new MyStack<>();
stack.push(3.14);
System.out.println(stack.peek());  // Output: 3.14

// Example of using MyQueue
MyQueue<Character> queue = new MyQueue<>();
queue.enqueue('A');
queue.dequeue();
System.out.println(queue.isEmpty());  // Output: true

// Example of using MyMinHeap
MyMinHeap minHeap = new MyMinHeap(10);
minHeap.add(10);
minHeap.add(5);
System.out.println(minHeap.peek());  // Output: 5



# Contributing
Contributions are welcome! Please feel free to submit pull requests, or open issues to suggest improvements or add new features.
