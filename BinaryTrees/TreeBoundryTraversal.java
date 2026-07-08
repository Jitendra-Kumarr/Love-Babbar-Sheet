import java.util.ArrayList;
import java.util.Collections;

class Node {
    int val; 
    Node left, right; 

    Node(int val){
        this.val = val; 
    }
}

public class TreeBoundryTraversal {

    static boolean isLeaf(Node node){
        return node.left == null && node.right == null;
    }

    static void addLeftBoundry(Node node, ArrayList<Integer> result){
        Node curr = node.left; 

        while (curr != null) {
            if(!isLeaf(curr)){
                result.add(curr.val); 
            }
            curr = (curr.left != null)? curr.left : curr.right; 
        }
    }

    static void addLeaves(Node node, ArrayList<Integer> result){
        if(node == null) return; 

        if(isLeaf(node)){
            result.add(node.val); 
            return; 
        }

        addLeaves(node.left, result);
        addLeaves(node.right, result);
    }

    static void addRightBoundry(Node node, ArrayList<Integer> result){
        Node curr = node.right; 

        ArrayList<Integer> temp = new ArrayList<>(); 
        while (curr != null) {
            if(!isLeaf(curr)){
                temp.add(curr.val); 
            }
            curr = (curr.right != null) ? curr.right : curr.left; 
        }
        Collections.reverse(temp);
        result.addAll(temp);
    }

    ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> result = new ArrayList<>(); 
        if(root == null) return result; 

        if(!isLeaf(root)){
            result.add(root.val); 
        }

        addLeftBoundry(root, result);
        addLeaves(root, result);
        addRightBoundry(root, result);
        
        return result; 
    }

    public static void main(String[] args) {

        // Manually construct the tree:
        //           1
        //         /   \
        //        2     3
        //       / \   / \
        //      4   5 6   7

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Test it with boundary traversal
        TreeBoundryTraversal obj = new TreeBoundryTraversal();
        ArrayList<Integer> result = obj.boundaryTraversal(root);
        System.out.println(result); // [1, 2, 4, 5, 6, 7, 3]
        
    }
}
