// package BinarySearchTrees;

class Node {
    int val; 
    Node left, right; 

    Node(int val){
        this.val = val; 
    }
}

public class kthLargestElement {
    static int count = 0; 
    private static int result = -1; 

    public static void InorderTraversal(Node node, int k){
        if(node == null) return ; 

        InorderTraversal(node.right, k);

        count++; 
        if(count == k){
            result = node.val;
            return ;
        }

        InorderTraversal(node.left, k); 

    }

    public int KthLargestElement(Node root, int k){
        InorderTraversal(root, k); 
        return result;
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

        kthLargestElement obj = new kthLargestElement();
        int k = 3;
        int ans = obj.KthLargestElement(root, k);

        System.out.println(k + "rd/th largest = " + ans); 
    }

}
