class Solution {
    public static int fn(int[][] grid,int srow, int scol, int frow, int fcol,int[][] dp){
        if(srow == frow && scol == fcol)
            return dp[srow][scol] = grid[frow][fcol];
        
        if(srow > frow || scol > fcol)
            return Integer.MAX_VALUE;
        if(dp[srow][scol] != -1) return dp[srow][scol];
        int t = Math.min(fn(grid, srow+1,scol,frow,fcol,dp),fn(grid,srow,scol+1,frow,fcol,dp));
        return dp[srow][scol] = grid[srow][scol] + t;
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int i=0; i<m; i++)
            for(int j = 0;j<n; j++)
                dp[i][j] = -1;
        fn(grid,0,0,m-1,n-1,dp);
        return dp[0][0];
    }
}