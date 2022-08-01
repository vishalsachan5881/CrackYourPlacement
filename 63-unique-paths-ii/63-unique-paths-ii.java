class Solution {
    public static int fn(int col, int row,int[][] o,int[][] dp){
        
        
        if(row < 0 || col < 0 || o[row][col] == 1) return 0;
        if(col == 0 && row == 0) return  dp[row][col]= 1;
        if(dp[row][col] != -1) return dp[row][col];
        int x = fn(col-1 ,row,o,dp);
        int y = fn(col, row-1,o,dp);
        dp[row][col] = x+y;
        return x+y;
    }
    public int uniquePathsWithObstacles(int[][]  o) {
        
        int row = o.length;
        int col = o[0].length;
        if(o[row-1][col-1] == 1) return 0;
        int[][] dp = new int[row][col];
        for(int i = 0 ; i  <row;i++)
            for(int j  =0 ; j<col;j++)
                dp[i][j] = -1;
        fn(col-1, row-1,o,dp);
        // for(int i = 0 ; i  <row;i++)
        //     for(int j  =0 ; j<col;j++)
        //         System.out.print(dp[i][j] + " ");
        // System.out.println();
        
        return dp[row-1][col-1];
    }
}