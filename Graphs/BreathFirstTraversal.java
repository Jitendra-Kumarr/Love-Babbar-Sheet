// package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreathFirstTraversal {

    public static ArrayList<Integer> bfs(int n, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs = new ArrayList<>(); 
        boolean visited[] = new boolean[n+1];
        
        Queue<Integer> q = new LinkedList<>(); 
        q.add(1); 
        visited[1] = true; 

        while (!q.isEmpty()) {
            int node = q.poll(); 
            bfs.add(node); 

            for(int it : adj.get(node)){
                if(visited[it] == false){
                    q.add(it); 
                    visited[it] = true; 
                }
            }
        }
        return bfs; 
    }
    public static void main(String[] args) {
        int n = 4, m = 3; 
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<=n; i++){
            adj.add(new ArrayList<>());
        }

        // 1 -- 2
        adj.get(1).add(2);
        adj.get(2).add(1);

        // 2 -- 3
        adj.get(2).add(3);
        adj.get(3).add(2);

        // 3 -- 4
        adj.get(3).add(4);
        adj.get(4).add(3);


        for(int i=0; i<=n; i++){
            for(int j=0; j<adj.get(i).size(); j++){
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }


        System.out.println("breath first Traversal :");

        ArrayList<Integer> result = bfs(n, adj);

        for(int val : result){
            System.out.print(val + " ");
        }
    }
}
