class Solution {
    public static int fn(int row, int col, List<List<Integer>> arr,int[][]dp){
        if(row == arr.size()-1)
            return dp[row][col] = arr.get(row).get(col);
        if(dp[row][col] != -1) return dp[row][col];
        int a  = arr.get(row).get(col) + fn(row+1, col+1, arr,dp);
        int aa = arr.get(row).get(col) + fn(row+1, col, arr,dp);
        return dp[row][col] = Math.min(a,aa);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        for(int  i = 0; i<n; i++)
            for(int  j = 0; j<n; j++)
                dp[i][j] = -1;
        return fn(0,0,triangle,dp);
    }
}