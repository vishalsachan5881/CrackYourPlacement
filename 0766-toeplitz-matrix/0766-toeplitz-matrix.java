class Solution {
    public static boolean fn(int[][] matrix, int seen, int c, int r){
          int m = matrix[0].length;
        int n = matrix.length;
       
        while(c < m && r < n){
                // System.out.println(seen + " " + r + " " + c);
                if(matrix[r][c] != seen) return false;
                
                c++; r++;
            }
        return true;
    }
    
    
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix[0].length;
        int n = matrix.length;
        
        for(int col = 0; col < m ; col++){
            int seen = matrix[0][col], c = col, r = 0;
            if(!fn(matrix, seen, c, r)) return false; 
            
        }
        
        for(int row = 1 ; row < n ; row++){
            int seen = matrix[row][0] ,c = 0, r = row;
            if(!fn(matrix, seen, c, r)) return false; 
        }
        return true;
    }
}