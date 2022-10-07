class Solution {
    int[][] vis;
    public void dfs(int row, int col, char[][] grid){
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == '0'|| vis[row][col] == 1)
            return;
        
        vis[row][col] = 1;
        
        dfs(row+1, col, grid);
        dfs(row-1, col, grid);
        dfs(row, col-1, grid);
        dfs(row, col+1, grid);
        
        
        
        
    }
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        
        vis = new int[row][col];
        int c = 0 ;
        for(int i = 0  ; i < row ; i++)
            for(int  j = 0 ; j < col ; j++){
                if(vis[i][j] == 0 && grid[i][j] == '1'){
                    c++;
                    dfs(i, j , grid);
                }
            }
        return c;
    }
}