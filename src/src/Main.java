import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        // Create an instance of MyArrayList
        MyArrayList<Integer> myList = new MyArrayList<>();
        myList.add(1);
        myList.add(4);
        myList.add(2);
        myList.add(6);
        System.out.print(myList.get(3));//6
        myList.removeFirst();
        int firstEl = myList.getFirst();
        System.out.print(firstEl);
        // Print list before sorting
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println(); // Move to next line

        // Remove the first element and print the first element after removal
        myList.removeFirst();
        System.out.println("First element after removal: " + myList.getFirst());

        // Sort the list
        myList.sort();
        // Print the sorted list
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println(); // Move to next line

        MyLinkedList<String> myLinkedList= new MyLinkedList<>();
        myLinkedList.add("This");
        myLinkedList.add("is");
        myLinkedList.add("LinkedList");
        System.out.println("Third word in this list: " + myLinkedList.get(2));
        myLinkedList.set(2,"Just List");
        System.out.println("Last word in this list right now: "+ myLinkedList.getLast());
        System.out.println("MyLinkedList:");
        for (String item : myLinkedList) {
            System.out.println(item);
        }
        // Cleaning list
        myList.clear();
        System.out.println("List cleared. The size of list: " + myList.size());

        MyStack<String> stack = new MyStack<>();
        stack.push("5");
        stack.push("8");
        stack.push("12");
        System.out.println("The size of stack: " + stack.size());
        System.out.println("The peek of stack: " + stack.peek());
        stack.pop();
        System.out.println("The peek of stack: " + stack.peek());
        MyQueue<String> queue = new MyQueue<>();
        // Add element to the queue
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        // Printing first element without removing
        System.out.println("In the start of the queue: " + queue.peek());
        queue.enqueue("4");
        queue.dequeue();
        System.out.println("In the start of the queue right now: " + queue.peek());
        // Create a MinHeap with an initial capacity
        MyMinHeap minHeap = new MyMinHeap(10);

        // Add elements to the heap
        minHeap.add(15);
        minHeap.add(10);
        minHeap.add(20);
        minHeap.add(17);
        minHeap.add(8);

        // Display the minimum element without removing it
        System.out.println("Minimum element: " + minHeap.peek());

        // Remove elements one by one and display them
        System.out.println("Removing elements:");
        while (minHeap.size > 0) {
            System.out.println(minHeap.poll());
        }
    }
}
