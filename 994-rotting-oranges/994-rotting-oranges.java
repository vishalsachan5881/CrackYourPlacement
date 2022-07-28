class Pair{
    int row, col;
    public Pair(int row, int col){
        this.row = row;
        this.col = col;
    }
}
class Solution {
    public boolean isValid(int row, int col , int[][] grid){
        int rown = grid.length;
        int coln = grid[0].length;
        
        return (row >= 0 && col >= 0 && row < rown && col < coln && grid[row][col] == 1) ;
    }
    public int orangesRotting(int[][] grid) {
        int rowc  = grid.length;
         int colc = grid[0].length;
        int total = 0;
        Queue<Pair> q = new LinkedList<>();
        
        for(int i = 0 ; i<rowc;i++){
            for(int j = 0; j<colc;j++){
                if(grid[i][j] != 0) total++;
                if(grid[i][j] == 2) q.offer(new Pair(i,j));
            }
        }
        // Queue<>
        if(total == 0 ) return 0;
        int t = 0;
        while(!q.isEmpty()){
            t++;
            int size = q.size();
            for(int i = 0 ; i < size;i++){
                Pair p = q.poll();
                
                if(p.row + 1 < rowc && grid[p.row+1][p.col] == 1){
                    grid[p.row+1][p.col] = 2;
                    q.offer(new Pair(p.row+1, p.col));
                }
                 if(p.row -1 >=0 && grid[p.row-1][p.col] == 1){
                    grid[p.row-1][p.col] = 2;
                    q.offer(new Pair(p.row-1, p.col));
                }
                 if(p.col + 1 < colc && grid[p.row][p.col+1] == 1){
                    grid[p.row][p.col+1] = 2;
                    q.offer(new Pair(p.row, p.col+1));
                }
                 if(p.col - 1>=0 && grid[p.row][p.col-1] == 1){
                    grid[p.row][p.col-1] = 2;
                    q.offer(new Pair(p.row, p.col-1));
                }
                
            }
        }
        for(int  i = 0 ; i < rowc;i++)
            for(int j = 0 ; j<colc;j++)
        {        if(grid[i][j] == 1) return -1;
        }
            return t-1;
    }
}