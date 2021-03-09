package datastructures.problems.linkedlists.singly.operations;

/**
 * Removing a Node
 **/
public class RemoveNode {
    static Node head; //-Global Var Head

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Remove a specific node form linked list
     **/
    static void removeNode(int key) {
        //Store head in a temp node
        Node temp = head, prev = null;
        //if head node needs to be removed
        if (temp != null && temp.data == key) {
            head = temp.next;//removed head node
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;/**Iterating through a list**/
            temp = temp.next;
        }
        /**if key not present**/
        if (temp == null) return;
        prev.next = temp.next; //Unlink the node from linked list
    }
    static Node removeLastNode(Node head){
        if(head == null) return null;
        if(head.next == null) return null;
        //Find second last node
        Node secondLast = head;
        while(secondLast.next.next!=null) secondLast=secondLast.next;
        //Change next of secondLast Node
        secondLast.next=null;//Delete last node
        return head;

    }
}
