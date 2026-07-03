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

    void inorder(Node root){
        if(root == null) return ; 

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    void postorder(Node root){
        if(root == null) return; 

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    
    public static void main(String[] args) {
        Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3);

        TreeImplementation obj = new TreeImplementation(); 
        obj.preorder(root);
        System.out.println();
        obj.inorder(root);
        System.out.println();
        obj.postorder(root);

    }
    
}
