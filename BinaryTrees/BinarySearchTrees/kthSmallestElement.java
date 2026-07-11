// package BinarySearchTrees;


class Node {
    int val; 
    Node left, right; 

    Node(int val){
        this.val = val; 
    }
}

public class kthSmallestElement {
    private static int count = 0; 
    private static int result = -1;

    public static int KthSmallestElement(Node root, int k){
        InorderTraversal(root, k); 
        return result;
    }

    public static void InorderTraversal(Node node, int k){
        if(node == null) return ; 

        InorderTraversal(node.left, k);

        count++; 
        if(count == k){
            result = node.val;
            return ;
        }

        InorderTraversal(node.right, k); 
    }

    public static Node insert(Node node, int val){
        if(node == null) return new Node(val); 

        if(val < node.val){
            node.left = insert(node.left, val); 
        } else {
            node.right = insert(node.right, val); 
        }
        return node; 
    }
    public static void main(String[] args) {
        Node root = null;
        int[] values = {50, 30, 70, 20, 40, 60, 80};

        for (int v : values) {
            root = insert(root, v);
        }

        kthSmallestElement obj = new kthSmallestElement();
        int k = 3;
        int ans = obj.KthSmallestElement(root, k);

        System.out.println(k + "rd/th smallest = " + ans); // expect 40
    }
}
