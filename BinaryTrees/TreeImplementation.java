// package BinaryTrees;

class Node {
    int data;
    Node left; 
    Node right; 

    Node(int data){
        this.data = data; 
    }
}

public class TreeImplementation {
    
    void preorder(Node root){
        if(root == null){
            return; 
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3);

        TreeImplementation obj = new TreeImplementation(); 
        obj.preorder(root);

    }
    
}
