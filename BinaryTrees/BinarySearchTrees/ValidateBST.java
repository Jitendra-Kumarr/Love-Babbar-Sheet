
class Node {
    int val; 
    Node left, right;

    Node(int val){
        this.val = val; 
    }
}

public class ValidateBST {

    public static boolean isValidBST(Node root){
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean isValidBST(Node root, long minVal, long maxVal ){
        if(root == null) return true; 
        if(root.val >= maxVal || root.val <= minVal) return false; 

        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
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

        boolean isvalidBinarySeachTree = isValidBST(root);

        System.out.println(isvalidBinarySeachTree);
    }
}
