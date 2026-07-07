import java.util.ArrayList;
import java.util.Queue;
import java.util.TreeMap;
import java.util.LinkedList;
import java.util.Map;

class Node {
    int data; 
    Node left, right; 

    Node(int data){
        this.data = data;
    }
}

public class TopView {


    static class Pair {
        Node node; 
        int hd; 

        Pair(Node node, int hd){
            this.node = node; 
            this.hd = hd; 
        }
    }


    public static ArrayList<Integer> topView(Node root){
        ArrayList<Integer> result = new ArrayList<>(); 

        if(root == null) return new ArrayList<>(); 

        Map<Integer, Integer> hdMap = new TreeMap<>(); 
        Queue<Pair> q = new LinkedList<>(); 
        q.add(new Pair(root, 0)); 

        while (!q.isEmpty()) {
            Pair current = q.poll();
            Node node = current.node; 
            int hd = current.hd;

            if(!hdMap.containsKey(hd)){
                hdMap.put(hd, node.data); 
            }

            if(node.left != null){
                q.add(new Pair(node.left, hd-1)); 
            }

            if(node.right != null){
                q.add(new Pair(node.right, hd+1)); 
            }
        }
        result.addAll(hdMap.values());
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
        
        System.out.println("Top View: " + topView(root));  // [2, 1, 3]
    }
}
