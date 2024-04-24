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
    }
}
