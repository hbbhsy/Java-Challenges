package queuey;

import java.util.LinkedList;
import java.util.Stack;

public class Queuey {

    LinkedList queue;

    // making a queue instance
    public Queuey() {
        queue = new LinkedList();
    }

    // Checking is the queque empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Check the size
    public int size() {
        return queue.size();
    }

    // Enqueueing an item (add an item)
    public void enqueue(String s) {
        queue.addLast(s);
    }

    // Dequeue the first item
    public String dequeue() {
        return (String) queue.remove(); // Casting the dequeued item to an string type
    }

    // Peek at the first item
    public String peek() {
        return (String) queue.get(0); // Get the first item and cast it to an string type
    }

    public static void main(String[] args) {
        System.out.println("Both queue and stack are buildin in Java, anc can be implemented using linkedlist.");
        System.out.println();
        System.out.println("Queue: First In First Out");
        Queuey q = new Queuey();
        q.enqueue("hi");
        q.enqueue("there");
        System.out.print(q.dequeue() + " ");
        System.out.println(q.dequeue()+ ".");

        // Stack: Last in First out
        System.out.println("Stack: Last In First Out");
        Stack<String> stacky = new Stack<>(); // Good coding practice to add <String>
        // Usually you want to work with only one data type in a linkedlist and good readability
        stacky.push("there"); // Add an item to the top(last) of the stack
        stacky.push("hi");
        System.out.print(stacky.pop() + " "); // pop the top(last) item
        System.out.println(stacky.pop() + "!");






    }
}
