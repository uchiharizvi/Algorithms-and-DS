package datastructures.problems.linkedlists.problemsets.easy.evenodd;

import datastructures.problems.linkedlists.problemsets.Node;

/**
 * Linked List Length Even or Odd?
 * Given a linked list of size N, your task is to complete the function isLengthEvenOrOdd()
 * which contains head of the linked list and check whether the length of linked list is even or odd.
 * <p>
 * Input:
 * The input line contains T, denoting the number of testcases.
 * Each testcase contains two lines. the first line contains N(size of the linked list). the second line contains N elements of the linked list separated by space.
 * <p>
 * Output:
 * For each testcase in new line, print "even"(without quotes) if the length is even else
 * "odd"(without quotes) if the length is odd.
 * <p>
 * User Task:
 * Since this is a functional problem you don't have to worry about input,
 * you just have to  complete the function isLengthEvenOrOdd() which takes head
 * of the linked list as input parameter and returns 0 if the length of the linked list
 * is even otherwise returns 1.
 **/
public class EvenOddList {
    Node head;

    public static void main(String[] args) {
        //Driver Code
        EvenOddList list = new EvenOddList();
        int result = 0;
        Node second = new Node(20);
        list.head = new Node(991);
        Node third = new Node(1000);
        Node fourth = new Node(19);
        Node fifth = new Node(1001);
        Node sixth = new Node(1);
        list.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        result = checkForEvenOdd(list.head);
        if (result == 1) System.out.println("even");
        else System.out.println("odd");
    }

    private static int checkForEvenOdd(Node head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        if (count % 2 == 0) return 1;
        else return 0;
    }
}
