package datastructures.problems.linkedlists.problemsets.hackerearth.reverselist;


public class ReverseListIterative {
    static Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        scan.nextInt();*/
        ReverseListIterative list = new ReverseListIterative();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Given Linked List : ");
        list.printList();
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed Linked List : ");
        list.printList();
    }

    private Node reverse(Node node) {
        Node prev = null;
        Node next = null;
        Node current = node;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
}
