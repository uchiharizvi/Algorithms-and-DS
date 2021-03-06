package datastructures.problems.linkedlists.problemsets.easy.reverselist;

import datastructures.problems.linkedlists.problemsets.Node;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseLinkedList {
    Node head;

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        Node next;
        Scanner scan = new Scanner(System.in);
        System.out.println("Size : ");
        int size = scan.nextInt();
        int pointer = 0;
        System.out.println("Enter List Value : ");
        for(int i=0;i<size;i++){
            if(i == 0) list.head = new Node(scan.nextInt());
            next = new Node(scan.nextInt());
        }




    }
}
