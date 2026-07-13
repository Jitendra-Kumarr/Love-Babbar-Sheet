import java.util.ArrayList;

class Node {
    int val; 
    Node left, right; 

    Node(int val){
        this.val = val; 
    }
}

public class TwoSumInBST {

    public static void inorder(Node node, ArrayList<Integer> values){
        if(node == null) return ; 

        inorder(node.left, values);
        values.add(node.val); 
        inorder(node.right, values);
    }

    public static boolean findTarget(Node root, int k){
        ArrayList<Integer> values = new ArrayList<>(); 
        inorder(root, values);

        int left = 0;
        int right = values.size()-1; 

        while (left < right) {
            int sum = values.get(left) + values.get(right); 

            if(k == sum){
                return true;
            } else if (k > sum){
                left++; 
            } else {
                right--; 
            }
        }
        return false; 
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
        int values[] =  {50, 30, 70, 20, 40, 60, 80};

        for(int val : values){
            root = insert(root, val); 
        }

        boolean result = findTarget(root, 100); 
        System.out.println(result);

    }
}
