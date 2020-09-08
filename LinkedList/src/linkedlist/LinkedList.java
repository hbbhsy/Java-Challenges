package linkedlist;

public class LinkedList {

    // Properties
    Node head;
    int count;


    // Constructors
//    public LinkedList() {
//        head = null;
//        count = 0;
//    }

    public LinkedList(Node newHead) {
        head = newHead;
        count = 1;
    }

    // Methods

    // add a node
    // create a node first and linked to the previous node
    public void add(int newData) {
        Node temp = new Node(newData);
        Node current = head;
        while(current.getNext() != null) { // .getNext does not exist if current is null
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }

    // get
    public int get(int index) {
        if (index <= 0) {
            return -1;
        }
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

    // size
    public int size() {
        return count;
    }

    // isEmpty
    public boolean isEmpty() {
        return head == null;
    }

    // remove
    public void remove() {
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();)
        }
        current = current.getNext();
    }

    public static void main(String[] args) {

        LinkedList<String> LinkedList = new LinkedList(<String>()){
//            LinkedList

        }
    }







}
