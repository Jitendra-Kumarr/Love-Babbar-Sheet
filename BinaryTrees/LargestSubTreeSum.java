class Node {
    int val; 
    Node left, right; 

    Node(int val){
        this.val = val; 
    }
}

public class LargestSubTreeSum {
    static int MaxSum = Integer.MIN_VALUE; 
    public static int MaxSumTreeSum(Node root){
        findSum(root); 
        return MaxSum;
    }

    public static int findSum(Node node){
        if(node == null) return 0; 

        int leftSum = findSum(node.left); 
        int rightSum = findSum(node.right); 

        int currentSum = leftSum + rightSum + node.val; 

        if(currentSum > MaxSum){
            MaxSum = currentSum; 
        }

        return currentSum; 
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(5);

        int result = findSum(root); 

        System.out.println(result);

    }
}
