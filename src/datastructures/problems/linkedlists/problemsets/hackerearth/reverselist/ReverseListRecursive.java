package datastructures.problems.linkedlists.problemsets.hackerearth.reverselist;

public class ReverseListRecursive {
    static Node head;//head

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        push(20);
        push(4);
        push(15);
        push(85);
        System.out.println("Given linked list");
        printList();

        head = reverse(head);

        System.out.println("Reversed Linked list");
        printList();
    }

    static Node reverse(Node head) {
        if(head == null || head.next == null) return head;

        Node rest = reverse(head.next);
        head.next.next = head;

        head.next = null;
        return rest;
    }

    static void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }
    static void push(int data)
    {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }
}
