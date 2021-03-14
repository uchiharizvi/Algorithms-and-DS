package datastructures.problems.stacks;

public class StackOperations {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];

    //Check if Empty
    public boolean isEmpty() {
        return (top < 0);
    }

    //Constructor
    public StackOperations() {
        top = -1;
    }

    //push operation -- to add an item to stack
    public boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    //pop operation - removing an element from stack
    public int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }
}
