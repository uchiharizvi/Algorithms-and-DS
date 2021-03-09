package datastructures.problems.linkedlists.singly;

/**
 * Node Class of linked list
 **/
public class Node {
    int data;
    Node next;
    Node prev;

    /**
     * Constructor
     **/
    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
