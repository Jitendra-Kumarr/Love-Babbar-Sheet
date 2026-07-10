// package BinarySearchTrees;]

class Node {
    int val; 
    Node left, right; 

    Node(int val){
        this.val = val; 
    }
}

public class CeilinBST {
    private static Node root; 

    public static Node insert(Node node, int val){
        if(node == null) return new Node(val); 

        if(val > node.val){
            node.right = insert(node.right, val); 
        } else {
            node.left = insert(node.left, val); 
        }
        return node; 
    }

    static int findCeil(Node root, int x){

        int ceil = -1; 
        while (root != null) {
            if(root.val == x){
                ceil = root.val; 
                return ceil; 
            }

            if(x > root.val){
                root = root.right; 
            } else if (x < root.val){
                ceil = root.val; 
                root = root.left; 
            }
        }
        return ceil; 
    }
    public static void main(String[] args) {
        int[] values = {50, 30, 70, 20, 40, 60, 80};

        for (int v : values) {
            root = insert(root, v);
        }

        System.out.println(findCeil(root, 10));  // expect 20 (smallest value >= 10)
        System.out.println(findCeil(root, 45));  // expect 50 (smallest value >= 45)
        System.out.println(findCeil(root, 50));  // expect 50 (exact match)
        System.out.println(findCeil(root, 90));  // expect -1 (nothing >= 90)
    }
}
