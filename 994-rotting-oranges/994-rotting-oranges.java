class Pair{
    int x, y;
    public Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class Solution {
    static int rowc;
    static int colc;
    
    
    public boolean isValid(int row, int col, int[][] grid){
        if(row >= rowc || col >= colc || row < 0 || col < 0 || grid[row][col] != 1)
            return false;
        return true;
    }
        
        
    public int orangesRotting(int[][] grid) {
         rowc= grid.length;
         colc= grid[0].length;
        int count = -1, orange = 0 ;
        Queue<Pair> q = new LinkedList<>();
        for(int i = 0 ; i < rowc ; i++)
            for(int j = 0 ; j < colc; j++)
                {if(grid[i][j] == 2)
                    q.offer(new Pair(i,j));
                 if(grid[i][j] == 1) orange++;
                }
        if(orange == 0) return 0;
        while(!q.isEmpty()){
            int n = q.size();
            for(int i = 0 ; i  < n ; i++){
                Pair curr = q.poll();
                if(isValid(curr.x+1, curr.y,grid)) {
                    grid[curr.x+1][curr.y] = 2;
                    q.offer(new Pair(curr.x+1, curr.y));
                }
                if(isValid(curr.x-1, curr.y,grid)) {
                    grid[curr.x-1][curr.y] = 2;
                    q.offer(new Pair(curr.x-1, curr.y));
                }
                if(isValid(curr.x, curr.y+1,grid)) {
                    grid[curr.x][curr.y+1] = 2;
                    q.offer(new Pair(curr.x, curr.y+1));
                }
                if(isValid(curr.x, curr.y-1,grid)) {
                    grid[curr.x][curr.y-1] = 2;
                    q.offer(new Pair(curr.x, curr.y-1));
                }
            }
            count++;
        }
        
        for(int i  = 0 ; i < rowc;i++)
            for(int j = 0; j < colc; j++)
                if(grid[i][j] == 1) return -1;
              
        return count;
    }
}