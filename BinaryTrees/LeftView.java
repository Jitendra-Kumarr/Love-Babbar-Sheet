import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

class Node {
    int value; 
    Node left, right; 

    Node(int value){
        this.value = value; 
    }
}


public class LeftView {
    public static ArrayList<Integer> leftView(Node root){
        ArrayList<Integer> result = new ArrayList<>(); 
        if(root == null) return result; 

        Queue<Node> q = new LinkedList<>(); 
        q.add(root); 

        while(!q.isEmpty()){
            int levelSize = q.size(); 

            for(int i=0; i<levelSize; i++){
                Node node = q.poll(); 

                if(i == 0){
                    result.add(node.value); 
                }

                if(node.left != null) q.add(node.left); 
                if(node.right != null) q.add(node.right); 
            }
        }
        return result; 
    }
    public static void main(String[] args) {
         /*
                1
              /   \
             2     3
              \
               4
                \
                 5
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);

        System.out.println("Left View: " + leftView(root));  // [1, 2, 4, 5]
    }

}
