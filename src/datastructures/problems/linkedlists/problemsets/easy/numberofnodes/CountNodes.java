package datastructures.problems.linkedlists.problemsets.easy.numberofnodes;

import datastructures.problems.linkedlists.problemsets.Node;

public class CountNodes {
    Node head;

    public static void main(String[] args) {
        CountNodes list = new CountNodes();
        Node second = new Node(2);
        list.head = new Node(1);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        list.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        int result = getCount(list.head);
        System.out.println(result);
    }

    public static int getCount(Node head) {
        int count = 0;

        while (head!=null){
            head=head.next;
            count++;
        }
        return count;
    }
}
