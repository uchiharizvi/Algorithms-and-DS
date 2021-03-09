package datastructures.problems.linkedlists.singly.operations;

public class AddNode {
    Node head;
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    /**adds a new node**/
    public void add(int data)
    {
        Node current = new Node(data);
        current.next = head;
        head = current;
    }
}
