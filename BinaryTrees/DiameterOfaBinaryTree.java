
class Node {
    int data;
    Node left; 
    Node right; 

    Node(int data){
        this.data = data; 
    }
}


public class DiameterOfaBinaryTree {
    int diameter = 0; 

    public int Diameter(Node root){
        HeightOfTree(root); 
        return diameter; 
    }

    public int HeightOfTree(Node root){
        if(root == null) return -1; 

        int leftHeight = HeightOfTree(root.left);
        int rightHeight = HeightOfTree(root.right);

        diameter = Math.max(diameter, leftHeight+rightHeight+2); 

        return 1 + Math.max(leftHeight, rightHeight);
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);

        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(20);

        root.left.left.left = new Node(1);
        root.left.left.right = new Node(4);
        root.left.right.right = new Node(8);
        root.right.left.left = new Node(11);
        root.right.right.right = new Node(25);

        DiameterOfaBinaryTree obj = new DiameterOfaBinaryTree(); 
        int result = obj.Diameter(root); 

        System.out.println(result);

    }
}
