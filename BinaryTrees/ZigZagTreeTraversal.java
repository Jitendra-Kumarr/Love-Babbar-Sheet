import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int val; 
    Node left, right;

    Node(int val){
        this.val = val; 
    }
}

public class zigzagTreeTraversal {
    static ArrayList<Integer> zigZagTraversal(Node root){
        ArrayList<Integer> result = new ArrayList<>(); 
        if(root == null) return result; 

        Queue<Node> q = new LinkedList<>(); 
        q.add(root);

        Boolean leftToRight = true; 

        while (!q.isEmpty()) {
            int size = q.size(); 
            ArrayList<Integer> level = new ArrayList<>(); 

            for(int i=0; i<size; i++){
                Node node = q.poll(); 

                level.add(node.val); 

                if(node.left != null) q.add(node.left); 
                if(node.right != null) q.add(node.right); 
            }

            if(!leftToRight){
                Collections.reverse(level);
            }
            result.addAll(level); 
            leftToRight = !leftToRight; 
        }
        return result; 
    }
    public static void main(String[] args) {
        /*
                1
             /     \
            2       3
           / \     / \
          4   5   6   7
         /             \
        8               9 
        
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.right.right.right = new Node(9);
    
        System.out.println("ZIGZAG TRAVERSAL: " + zigZagTraversal(root));
    }
}
