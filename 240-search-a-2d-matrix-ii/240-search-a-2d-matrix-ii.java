class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rown = matrix.length;
        int coln = matrix[0].length;
        
        int col = coln-1, row = 0;
        
        while(col >= 0 && row < rown){
            
            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] > target) col--;
            else row++;
        }
        return false;
        
    }
}