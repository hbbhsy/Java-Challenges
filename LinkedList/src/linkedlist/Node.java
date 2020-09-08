package linkedlist;

public class Node {
    // Properties
    Node next;
    int data;

    // Methods

    // Constructors
    public Node(int newData) {
        data = newData;
        next = null;
    }

    public Node(int newData, Node newNext) {
        data = newData;
        next = newNext;
    }

    // Getters and Setters

    public Node getNext() {
        return next;
    }

    public int getData() {
        return data;
    }

    public void setData(int newData) {
        data = newData;
    }

    public void setNext(Node newNode) {
        next = newNode;
    }
}
