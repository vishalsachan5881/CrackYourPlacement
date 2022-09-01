class Solution {
    
    public void dfs(char[][] grid, int[][] visited, int i, int j){
        
        int rn  = grid.length, cn = grid[0].length;
        
        if(i<0 || j < 0 || i >= rn || j >= cn || grid[i][j] == '0' || visited[i][j] == 1)
        return ;
      
        visited[i][j] = 1;
        dfs(grid, visited, i+1, j);
        dfs(grid, visited, i-1, j);
        dfs(grid, visited, i, j+1);
        dfs(grid, visited, i, j-1);
        
    }
    
    
    
    public int numIslands(char[][] grid) {
        int cnt  = 0 ;
        int row = grid.length;
        int col  = grid[0].length;
        int[][] visited = new int[row][col];
        int c = 0 ;
        
        for(int i  = 0 ; i < row;i++){
            for(int  j = 0 ; j < col ; j++){
                if(grid[i][j] =='1' && visited[i][j] == 0)
                {
                    c++;
                    dfs(grid, visited, i, j);
                }
            }
        }
        return c;
    }
}