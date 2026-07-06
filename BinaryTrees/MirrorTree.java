
class Node {
    int data; 
    Node left; 
    Node right; 

    Node(int data){
        this.data = data; 
    }
}


public class MirrorTree {

    public static void printTree(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        printTree(root.left);
        printTree(root.right);
    }


    public Node mirrorTree(Node root){
        if(root == null) return null; 

        Node temp = root.left; 
        root.left = root.right; 
        root.right = temp; 

        mirrorTree(root.left); 
        mirrorTree(root.right); 

        return root; 
    }

    public static void main(String[] args) {
        Node root = new Node(1); 
        root.right = new Node(2); 
        root.left = new Node(3); 

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        MirrorTree obj = new MirrorTree(); 
        Node result = obj.mirrorTree(root); 

        printTree(result);
    }
}
