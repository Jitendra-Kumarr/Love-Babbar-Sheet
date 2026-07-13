import java.util.ArrayList;

class Node {
    int val; 
    Node left, right; 

    Node(int val){
        this.val = val; 
    }
}

public class RecoverBST {

    public static void inorder(Node node, ArrayList<Node> nodes){
        if(node == null) return ; 

        inorder(node.left, nodes);
        nodes.add(node);
        inorder(node.right, nodes);
    }

    public static void recoverBST(Node root){
        ArrayList<Node> nodes = new ArrayList<>(); 
        inorder(root, nodes); 

        Node first = null, second = null; 

        for(int i=0; i<nodes.size()-1; i++){
            if(nodes.get(i).val > nodes.get(i+1).val){
                if(first == null){
                    first = nodes.get(i); 
                }
                second = nodes.get(i+1); 
            }
        }
        int temp = first.val; 
        first.val = second.val; 
        second.val = temp; 
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
    
        // manually corrupt the tree: swap two node values to simulate the "mistake"
        Node nodeA = find(root, 30);
        Node nodeB = find(root, 70);
        int temp = nodeA.val;
        nodeA.val = nodeB.val;
        nodeB.val = temp;
    
        System.out.print("Before recovery (inorder): ");
        printInorder(root);
    
        recoverBST(root);
    
        System.out.print("After recovery (inorder): ");
        printInorder(root);
    }
    
    public static Node find(Node node, int val) {
        if (node == null) return null;
        if (node.val == val) return node;
        return (val < node.val) ? find(node.left, val) : find(node.right, val);
    }
    
    public static void printInorder(Node node) {
        if (node == null) return;
        printInorder(node.left);
        System.out.print(node.val + " ");
        printInorder(node.right);
        if (node.val == 50 && node.left != null) System.out.println(); 
    }

}
