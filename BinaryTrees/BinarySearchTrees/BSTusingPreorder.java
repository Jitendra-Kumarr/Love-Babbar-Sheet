
class Node {
    int val; 
    Node left, right; 

    Node(int val){
        this.val = val; 
    }
}

public class BSTusingPreorder {

    public static Node bstFromPreorder(int[] preorder){
        Node root = null; 
        for(int val : preorder){
            root = insert(root, val);
        }
        return root; 
    }

    private static Node insert(Node node, int val){
        if(node == null) return new Node(val); 

        if(val > node.val){
            node.right = insert(node.right, val);
        } else {
            node.left = insert(node.left, val); 
        }
        return node; 
    }

    public static void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.val + " ");
        inorder(node.right);
    }
    public static void main(String[] args) {
        int[] preorder = {50, 30, 20, 40, 70, 60, 80};

        Node root = bstFromPreorder(preorder);

        System.out.println("Root: " + root.val);
        System.out.print("Inorder (should be sorted): ");
        inorder(root);
        System.out.println();
    }
}
