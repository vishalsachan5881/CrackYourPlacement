class Solution {
    static int row, col;
    static Integer[][] dp ;
    public int help(int r, int c, int[][] matrix){
        if(c < 0 || c > col-1) return Integer.MAX_VALUE;
        if(r==row-1) return matrix[r][c];
        if(dp[r][c] != null) return dp[r][c];
        int d = help(r+1, c, matrix);
        int ld = help(r+1, c-1,matrix);
        int rd = help(r+1, c+1, matrix);
        
        int tt = Math.min(d,ld);
        return dp[r][c] = matrix[r][c] + Math.min(tt, rd);
    }
    public int minFallingPathSum(int[][] matrix) {
        row = matrix.length;
        col = matrix[0].length;
        dp = new Integer[row][col];
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < col ; i++)
            min = Math.min(min, help(0, i, matrix));
        
        return min;
    }
}