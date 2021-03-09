package datastructures.problems.stacks.implementations.costlyenque;

import datastructures.problems.stacks.StackOperations;

public class QueueFromStack {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.deque());
        System.out.println(q.deque());
        System.out.println(q.deque());
    }
    static class Queue {
        static StackOperations s1 = new StackOperations();
        static StackOperations s2 = new StackOperations();

        /**
         * implement Queue using two stacks with costly enQueue()
         **/
        void enqueue(int x) {
            //Move all elements from s1 to s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            //push x to s1
            s1.push(x);
            //Push everything back to s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        /**
         * Dequeue an item from the queue
         **/
        int deque() {
            // if first stack is empty
            if (s1.isEmpty()) {
                System.out.println("Queue is Empty");
                System.exit(0);
            }
            // Return top of s1
            int x = s1.peek();
            s1.pop();
            return x;
        }
    }
}
