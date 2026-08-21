// package Graphs;

import java.util.ArrayList;

public class DepthFirstSearch {

    public static void dfs(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans){
        vis[node] = true; 
        ans.add(node); 

        for(int it : adj.get(node)){
            if(vis[it] == false){
                dfs(it, vis, adj, ans);
            }
        }

    }

    public static ArrayList<Integer> dfsofGraph(ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> ans = new ArrayList<Integer>(); 
        boolean vis[] = new boolean[adj.size()]; 


        dfs(1, vis, adj, ans);
        return ans; 
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


        ArrayList<Integer> dfs = dfsofGraph(adj);

        for(int i=0; i<dfs.size(); i++){
            System.out.print(dfs.get(i) + " ");
        }

    }
}
