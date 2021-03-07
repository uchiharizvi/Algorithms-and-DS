package datastructures.problems.linkedlists.problemsets.hackerearth.reverselist;

import java.util.Scanner;

public class ReverseListHackerEarth {
    static Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String args[]) throws Exception {

        // Write your code here
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        for (int i = 0; i < size; i++) {
            push(s.nextInt());
        }
        head = reverse(head);
        printList();
    }

    static Node reverse(Node node) {
        Node prev = null;
        Node next = null;
        Node current = node;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    static void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    static void push(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }
}

