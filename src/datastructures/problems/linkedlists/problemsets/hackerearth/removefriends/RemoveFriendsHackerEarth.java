package datastructures.problems.linkedlists.problemsets.hackerearth.removefriends;


import java.util.Scanner;

/**
 * Problem:
 * After getting her PhD, Christie has become a celebrity at her university, and her
 * facebook profile is full of friend requests. Being the nice girl she is, Christie has accepted all the requests.
 * Now Kuldeep is jealous of all the attention she is getting from other guys,
 * so he asks her to delete some of the guys from her friend list.
 * To avoid a 'scene', Christie decides to remove some friends from her friend list,
 * since she knows the popularity of each of the friend she has, she uses the following algorithm to delete a friend.
 * -------------------------------------------------------------------------------------------------------------------
 * Algorithm Delete(Friend):
 * -------------------------------------------------------------------------------------------------------------------
 * DeleteFriend=false
 * for i = 1 to Friend.length-1
 * if (Friend[i].popularity < Friend[i+1].popularity)
 * delete i th friend
 * DeleteFriend=true
 * break
 * if(DeleteFriend == false)
 * delete the last friend
 * -------------------------------------------------------------------------------------------------------------------
 * Input:
 * First line contains T number of test cases. First line of each test case contains N, the number of friends Christie
 * currently has and K ,the number of friends Christie decides to delete. Next lines contains popularity of her friends
 * separated by space.
 * -------------------------------------------------------------------------------------------------------------------
 * Output:
 * For each test case print N-K numbers which represent popularity of Christie friend's after deleting K friends.
 * -------------------------------------------------------------------------------------------------------------------
 * Constraints
 * 1<=T<=1000
 * 1<=N<=100000
 * 0<=K< N
 * 0<=popularity_of_friend<=100
 * -------------------------------------------------------------------------------------------------------------------
 * NOTE:
 * Order of friends after deleting exactly K friends should be maintained as given in input.
 * Sample Input                                     Sample Output
 * 3                                                100 1
 * 3 1                                              19 12 17
 * 3 100 1                                          77 18
 * 5 2
 * 19 12 3 4 17
 * 5 3
 * 23 45 11 77 18
 **/
public class RemoveFriendsHackerEarth {
    static Node head;

    static class Node {
        int data;
        Node next;
        Node prev;

        public Node() {
        }

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //Number of test cases
        int testCases = s.nextInt();
        for (int i = 0; i < testCases; i++) {
            //Total Number of friends
            int n = s.nextInt();
            //Friends to be deleted
            int k = s.nextInt();
            int[] popularity = new int[n];//FIX IT - create a linked list
            for (int j = k - 1; j < n; j++) {
                popularity[j] = s.nextInt();
            }
            push(popularity);
            deleteFriend(k);
            printList();
        }

    }

    private static Node push(int[] popularity) {
        for (int data : popularity) insert(data);
        return head;
    }

    private static Node insert(int data) {
        Node temp = new Node();
        Node ptr;
        temp.data = data;
        temp.next = null;
        if (head == null) head = temp;
        else {
            ptr = head;
            while (ptr.next != null) ptr = ptr.next;
            ptr.next = temp;
        }
        return head;
    }

    static void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    private static void deleteFriend(int deleteFriend) {
        boolean delF = false;//placeholder if friend is deleted
        Node ptr;
        Node tail;
        ptr = head;
        while (ptr.next != null) {
            if (ptr.data < ptr.next.data) {
                remove(ptr.data);
                delF = true;
                break;
            }
        }
        if (delF == false) {
            while (ptr.next == null) remove(ptr.data);
        }

    }

    /**
     * Deleting a node in a linked list
     **/
    private static void remove(int key) {
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
        prev.next = temp.next;
    }
}
