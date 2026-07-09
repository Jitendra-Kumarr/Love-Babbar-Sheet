
class Node { 
    int val; 
    Node left, right; 

    Node(int val){
        this.val = val; 
    }
}


public class TransformToSumTree {

    public static void InOrderTraversal(Node root){
        if(root == null) return; 

        InOrderTraversal(root.left); 
        System.out.print(root.val+" ");
        InOrderTraversal(root.right);
    }


    public void toSumTree(Node root){
        toSum(root); 
    }
    public int toSum(Node node){
        if(node == null) return 0; 

        int originalValue = node.val; 

        int leftSum = toSum(node.left); 
        int rightSum = toSum(node.right); 

        node.val = leftSum+rightSum; 

        return leftSum+rightSum+originalValue;
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(-2);
        root.right = new Node(6);
        root.left.left = new Node(8);
        root.left.right = new Node(-4);
        root.right.left = new Node(7);
        root.right.right = new Node(5);

        TransformToSumTree obj = new TransformToSumTree(); 
        obj.toSumTree(root); 

        InOrderTraversal(root); 

    }
}
