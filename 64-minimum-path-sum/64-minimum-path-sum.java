class Solution {
    public int minPathSum(int[][] grid) {
        for(int col = grid[0].length-2; col>=0; col--){
            grid[grid.length-1][col] += grid[grid.length-1][col+1];
        }
        for(int row = grid.length-2;row>=0;row--){
            grid[row][grid[0].length-1] += grid[row+1][grid[0].length-1];
        }
        
        for(int i = grid.length-2; i>=0;i--)
            for(int j = grid[0].length-2; j>=0;j--){
                grid[i][j] += Math.min(grid[i][j+1],grid[i+1][j]);
            }
        
        return grid[0][0];
    }
}