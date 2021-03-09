package datastructures.problems.linkedlists;


public class PrintList {

    public static void print(Node head) {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public class Node {
        int data;
        Node next;

        /**
         * Constructor
         **/
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
