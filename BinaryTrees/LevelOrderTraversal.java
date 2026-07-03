// package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data; 
    Node left; 
    Node right; 

    Node(int data){
        this.data = data; 
    }
}

public class LevelOrderTraversal {

    public void levelOrderTraversal(Node root){
        if(root == null) return ; 

        Queue<Node> q = new LinkedList<>(); 
        q.add(root); 

        while(!q.isEmpty()){
            Node current = q.remove(); 
            System.out.print(current.data + " ");

            if(current.left != null) q.add(current.left); 
            if(current.right != null) q.add(current.right);
        }
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


        LevelOrderTraversal obj = new LevelOrderTraversal(); 
        obj.levelOrderTraversal(root);

    }


}
