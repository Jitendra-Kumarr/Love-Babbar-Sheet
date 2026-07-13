class Node {
    int val; 
    Node left, right; 
    
    Node(int val){
        this.val = val; 
    }
}


public class PredecessorAndSuccessor {

    public static int Predecessor(Node root, int k){

        int Predecessor = -1; 
        while (root != null) {
            if(k <= root.val){
                root = root.left; 
            } else {
                Predecessor = root.val; 
                root = root.right; 
            }
        }
        return Predecessor; 
    }

    public static Node insert(Node node, int val){
        if(node == null) return new Node(val);

        if(val < node.val){
            node.left = insert(node.left, val); 
        } else if (val > node.val){
            node.right = insert(node.right, val); 
        }

        return node; 
    }

    public static int Successor(Node root, int k){

        int Successor = -1;
        while(root != null){
            if(k >= root.val){
                root = root.right; 
            } else {
                Successor = root.val; 
                root = root.left; 
            }
        }
        return Successor; 
    }
    public static void main(String[] args) {
        Node root = null; 
        int[] values = {50, 30, 70, 20, 40, 60, 80};

        for (int v : values) {
            root = insert(root, v);
        }

        int SuccessorOfBST = Successor(root, 40); 
        int PredecessorOfBST = Predecessor(root, 40); 

        System.out.println(PredecessorOfBST +" "+ SuccessorOfBST);
    }
}