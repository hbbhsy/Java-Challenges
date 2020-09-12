package queuey;

import java.util.LinkedList;

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
    public void enqueue(int n) {
        queue.addLast(n);
    }

    // Dequeue the first item
    public int dequeue() {
        return (int) queue.remove();// Casting the dequeued item to an int type
    }

    // Peek at the first item
    public int peek() {
        return (int) queue.get(0); // Get the first item and cast it to an int type
    }

    public static void main(String[] args) {
        Queuey q = new Queuey();
        q.enqueue(5);
        q.enqueue(7);
        q.enqueue(6);
        System.out.println("First out: "+q.dequeue());
        System.out.println("Peek at second item: " + q.peek());
        System.out.println("Second out: " + q.dequeue());
        System.out.println("Third out: " + q.dequeue());



    }
}
