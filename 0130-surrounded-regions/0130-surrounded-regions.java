class Solution {
    public void dfs(char[][] board, int row, int col){
        if(row < 0 || col < 0 || row > board.length-1 || col > board[0].length-1 || board[row][col] != 'O')
            return ;
        
        board[row][col] = '$';
        dfs(board, row+1, col);
        dfs(board, row-1,col);
        dfs(board, row, col+1);
        dfs(board, row, col-1);
    }
    public void solve(char[][] board) {
        int m  = board[0].length;
        int n = board.length;
        
        for(int i = 0; i<m;i++){
            if(board[0][i] == 'O')
                dfs(board, 0, i);
            if(board[n-1][i] == 'O')
                dfs(board, n-1, i);
        }
        for(int i = 1; i < n-1 ;i++){
            if(board[i][0] == 'O')
                dfs(board, i, 0);
            if(board[i][m-1] == 'O')
                dfs(board, i, m-1);
        }
        
        for(int i = 0 ; i < n ; i++)
            for(int j = 0 ; j< m;j++)
            {
                if(board[i][j] != '$') board[i][j] = 'X';
                    else
            board[i][j] = 'O';
            }
    }
}