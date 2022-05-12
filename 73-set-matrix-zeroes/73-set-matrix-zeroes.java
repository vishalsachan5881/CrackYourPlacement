class Solution {
    public void setRow(int row, int[][] matrix){
        for(int i = 0 ; i<matrix[0].length; i++)
            matrix[row][i] = 0;
    }
    public void setCol(int col, int[][] matrix){
        for(int i = 1 ; i<matrix.length; i++)
            matrix[i][col] = 0;
    }
    public void setZeroes(int[][] matrix) {
        int rowNum = matrix.length;
        int colNum = matrix[0].length;
        boolean colZero = false, rowZero = false;
        
        for(int i = 0; i<rowNum; i++)
        {
            if(matrix[i][0] == 0) {rowZero = true;break;}
            
        }
        
        for(int j = 0;j<colNum; j++)
        {
            if(matrix[0][j] == 0) {colZero = true;break;}
         //   break;
        }
        
         System.out.println(rowZero + " " + colZero );
        
        for(int i = 1; i<rowNum; i++)
            for(int j = 1 ; j<colNum ; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        
        
        for(int i = 1; i<colNum;i++){
            if(matrix[0][i] == 0)
                setCol(i,matrix);
        }
        //https://web.whatsapp.com/ 
        for(int j = 1; j<rowNum; j++)
            if(matrix[j][0] == 0)
                setRow(j,matrix);
        
       
        if(rowZero)
            for(int i = 0; i<matrix.length; i++)
                matrix[i][0] = 0;
        if(colZero)
            for(int i = 0;i<matrix[0].length; i++)
                matrix[0][i] = 0;
        
        
        
         
    }
}