class Solution {
    public void transpose(int[][] matrix){
        
        int n = matrix.length;
        for(int row = 0 ; row < n ; row++)
            for(int col = row ; col < n ; col++){
                int t = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = t;
            }
        
    }
    public void print(int[][] mat){
        int n = mat.length;
        
        for(int i = 0 ; i < n ; i++)
            for(int j = 0 ; j < n ; j++)
                System.out.print(mat[i][j]+ " ");
        System.out.println();
    }
    public void reverse(int[][] matrix){
        int n  = matrix.length;
        for(int row=0; row < n ; row++){
            int start = 0, end = n-1;
            while(start < end){
                int t = matrix[row][start];
                matrix[row][start] = matrix[row][end];
                matrix[row][end] = t;
                
                start++;
                end--;
            }
        }
    }
    public void rotate(int[][] matrix) {
        transpose(matrix);
        //print(matrix);
       reverse(matrix);
    }
}