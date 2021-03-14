package datastructures.problems.tree.BinaryTree;

/**Operations of a Binary Tree**/
public class BinaryTree {
    static Node root; // root of a binary tree

    BinaryTree() {
        root = null;
    }
    BinaryTree(int key) {
        root = new Node(key);
    }

    public static void main(String[] args) {
        /*Create Root*/
        root = new Node(1);
        /** following is the tree after above statement
              1
            /   \
          null  null     */
        root.left = new Node(2);
        root.right = new Node (3);
        /** 2 and 3 become left and right children of 1
               1
            /     \
          2        3
        /   \     /  \
      null null null null  */
        root.left.left = new Node (4);
        /** 4 becomes left child of 2
                    1
                /       \
               2          3
             /   \       /  \
            4    null  null  null
           /   \
          null null
         */

    }
    static class Node{
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }
}
