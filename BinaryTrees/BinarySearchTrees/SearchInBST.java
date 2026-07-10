// package BinarySearchTrees;

class Node {
    int val; 
    Node left, right; 

    Node(int val){
        this.val = val;
    }
}

public class SearchInBST {
    private static Node root; 

    public static Node insert(Node node, int val){
        if(node == null) return new Node(val);

        if(val < node.val){
            node.left = insert(node.left, val); 
        } else if (val > node.val){
            node.right = insert(node.right, val); 
        }

        return node; 
    }

    public static Node searchInBST(Node root, int val){
        while (root != null && root.val != val) {
            root = val < root.val ? root.left : root.right; 
        }
        return root; 
    }

    public static void InorderTraversal(Node root){
        if(root == null) return; 

        InorderTraversal(root.left); 
        System.out.print(root.val + " ");
        InorderTraversal(root.right); 
    }
    public static void main(String[] args) {
        int[] values = {50, 30, 70, 20, 40, 60, 80};

        for (int v : values) {
            root = insert(root, v);
        }

        InorderTraversal(root); 
        System.out.println();

        Node found = searchInBST(root, 40); 
        if(found != null){
            System.out.println(found.val);
        } else {
            System.out.println("Not Found!!! ");
        }
    }
}
