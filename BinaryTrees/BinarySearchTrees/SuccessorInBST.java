
class Node {
    int val; 
    Node left, right; 

    Node(int val){
        this.val = val; 
    }
}

public class SuccessorInBST {

    public static int inorderSuccessor(Node root, int k){
        int successor = -1; 

        while (root != null) {
            if(k >= root.val){
                root = root.right; 
            } else {
                successor = root.val; 
                root = root.left; 
            }
        }
        return successor; 
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
        Node root = null;
        int[] values = {50, 30, 70, 20, 40, 60, 80};

        for (int v : values) {
            root = insert(root, v);
        }

        int result = inorderSuccessor(root, 60); 

        System.out.println(result);
    }

}
