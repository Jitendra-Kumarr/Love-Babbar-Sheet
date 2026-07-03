// package BinaryTrees;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class MaxDepth {

    public int maxDepth(Node root) {
        if (root == null) return 0;

        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);

        return 1 + Math.max(leftMax, rightMax);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);

        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(20);

        root.left.left.left = new Node(1);
        root.left.left.right = new Node(4);
        root.left.right.right = new Node(8);
        root.right.left.left = new Node(11);
        root.right.right.right = new Node(25);

        MaxDepth obj = new MaxDepth();
        int height = obj.maxDepth(root);

        System.out.println(height);
    }
}
