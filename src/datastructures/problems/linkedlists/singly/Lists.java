package datastructures.problems.linkedlists.singly;

import java.util.LinkedList;

/**
 * LinkedList Working
 * A simple Java program to introduce a linked list
 **/
public class Lists {
    Node head;

    public static void main(String[] args) {
        Lists list = new Lists();
        list.head = new Node(1);//define head of list
        Node second = new Node(2);
        Node third = new Node(3);
        /* Three nodes have been allocated dynamically.
          We have references to these three blocks as head,
          second and third

          llist.head        second              third
             |                |                  |
             |                |                  |
         +----+------+     +----+------+     +----+------+
         | 1  | null |     | 2  | null |     |  3 | null |
         +----+------+     +----+------+     +----+------+ */
        list.head.next = second; //Attach node to head
        /*  Now next of the first Node refers to the second.  So they
            both are linked.

         llist.head        second              third
            |                |                  |
            |                |                  |
        +----+------+     +----+------+     +----+------+
        | 1  |  o-------->| 2  | null |     |  3 | null |
        +----+------+     +----+------+     +----+------+ */
        second.next = third; //Link second node to third node
        /*  Now next of the second Node refers to third.  So all three
            nodes are linked.

         llist.head        second              third
            |                |                  |
            |                |                  |
        +----+------+     +----+------+     +----+------+
        | 1  |  o-------->| 2  |  o-------->|  3 | null |
        +----+------+     +----+------+     +----+------+ */
        list.printList();
    }
    public void printList(){
        Node n = head;
        while (n!=null){
            System.out.print(n.data + " ");
            n=n.next;
        }
    }

}
