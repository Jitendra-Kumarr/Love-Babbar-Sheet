import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Node {
    int data; 
    Node left, right; 

    Node(int data){
        this.data = data; 
    }
}

public class BottomView {

    static class pair {
        Node node; 
        int hd; 

        pair(Node node, int hd){
            this.node = node; 
            this.hd = hd; 
        }
    }

    public static ArrayList<Integer> bottomView(Node root){
        ArrayList<Integer> result = new ArrayList<>(); 
        if(root == null) return result; 

        Queue<pair> q = new LinkedList<>(); 
        Map<Integer, Integer> hdmap = new TreeMap<>(); 

        q.add(new pair(root, 0)); 

        while(!q.isEmpty()){
            pair curr = q.poll();
            Node node = curr.node; 
            int hd = curr.hd; 

            hdmap.put(hd, node.data);

            if(node.left != null) q.add(new pair(node.left, hd-1)); 
            if(node.right != null) q.add(new pair(node.right, hd+1)); 
        }
        result.addAll(hdmap.values()); 
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
        
        System.out.println("Bottom View: " + bottomView(root));  // [2, 4, 5]
    }

}
