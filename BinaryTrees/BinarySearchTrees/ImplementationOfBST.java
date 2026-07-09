// package BinarySearchTrees;

class Node{
    int val; 
    Node left, right; 

    Node(int val){
        this.val = val;
    }
}

public class ImplementationOfBST {

    static Node root; 

    static Node insert(Node node, int val){
        if(node == null){
            return new Node(val); 
        }

        if(val < node.val){
            node.left = insert(node.left, val); 
        } else if (val > node.val){
            node.right = insert(node.right, val);
        }

        return node; 
    }

    static void InorderTraversal(Node node){
        if(node == null) return; 

        InorderTraversal(node.left); 
        System.out.print(node.val + " ");
        InorderTraversal(node.right); 
    }

    public static void main(String[] args) {
        int[] values = {50, 30, 70, 20, 40, 60, 80};

        for (int v : values) {
            root = insert(root, v);
        }

        InorderTraversal(root); 
    }
}
