// package BinarySearchTrees;
class Node {
    int val; 
    Node left, right;

    Node(int val){
        this.val = val; 
    }
}
public class FloorInBST {
    private static Node root ; 

    public static int floor(Node root, int x){
        int floor = -1; 
        while (root != null) {
            if(root.val == x){
                floor = root.val; 
                return floor; 
            }

            if(x > root.val){
                floor = root.val; 
                root = root.right; 
            } else {
                root = root.left; 
            }
        }
        return floor; 
    }

    public static Node insert(Node node, int val){
        if(node == null) return new Node(val); 

        if(val > node.val){
            node.right = insert(node.right, val); 
        } else {
            node.left = insert(node.left, val); 
        }
        return node; 
    }

    public static void main(String[] args) {
        int[] values = {50, 30, 70, 20, 40, 60, 80};

        for (int v : values) {
            root = insert(root, v);
        }
        // floor : The largest value in the tree that is less than or equal to x.
        System.out.println(floor(root, 65)); // expect 60
        System.out.println(floor(root, 25)); // expect 20
        System.out.println(floor(root, 5));  // expect -1
        System.out.println(floor(root, 50)); // expect 50
    }
}
