class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dest, int k) {
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<int[]>());
        for(int arr[] : flights){
            int u = arr[0];
            int v = arr[1];
            int cost = arr[2];
            adj.get(u).add(new int[]{v,cost});
        }
        Queue<int[] > q = new LinkedList<>();
        q.add(new int[]{src,0,k+1});
        int ans =Integer.MAX_VALUE;
        int cost[] = new int[n];
        Arrays.fill(cost,Integer.MAX_VALUE);
        cost[src]= 0;
        // BFS 
        while(!q.isEmpty()){
            int cur[] = q.poll();
            int curV = cur[0];
            int curCost = cur[1];
            int remStop = cur[2];
            if(curV==dest && remStop >=0){
                ans=Math.min(ans,curCost);
            }
            for(int edge[] : adj.get(curV)){
                // If Current cost is Minimum then Add into queue
                if(cost[edge[0]] > curCost + edge[1] ){
                    cost[edge[0]] = curCost + edge[1];
                    q.add(new int[]{edge[0],curCost + edge[1],remStop-1});
                }
            }
            k--;
        }
        if(ans ==Integer.MAX_VALUE)
            return -1;
       return ans; 
    }
}