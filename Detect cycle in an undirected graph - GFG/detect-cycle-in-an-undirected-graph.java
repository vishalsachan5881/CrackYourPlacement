//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


class Solution {
    
    // Function to detect cycle in an undirected graph.
    // public void dfs(int src, int[] vis, HashMap<Integer, Integer> hm, ArrayList<ArrayList<Integer>> adj,int[] ans){
        
    //     vis[src] = 1;
        
    //     for(var v  : adj.get(src)){
    //         if(vis[v] == 0)
    //         {
    //             hm.put(v, src);
    //             dfs(v, vis, hm, adj, ans);
    //         }
    //         else{
    //             if(hm.containsKey(v) && hm.get(src) != v)
    //             ans[0] = 1;
    //         }
    //     }
        
    // }
    
    public void dfs(int[] ans,int src, int parent, int[] vis, ArrayList<ArrayList<Integer>> adj){
        vis[src] = 1;
        
        for(var v : adj.get(src))
        {
            if(vis[v] == 0){
                dfs(ans,v, src, vis, adj);
            }else{
                if(v != parent){
                    ans[0] =1;
                }
            }
        }
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        
        int[] vis = new int[V];
        // HashMap<Integer, Integer> hm = new HashMap<>();
        Arrays.fill(vis,0);
        int[] ans = new int[1];
        // hm.put(1,-1);
        for(int i = 0 ; i < V; i++){
            if(vis[i] == 0){
                // ans[0] = 0;
                dfs(ans,i, -1,vis, adj );
                if(ans[0] == 1) {return true;}
            }
        }
         
         return false;
    }
}