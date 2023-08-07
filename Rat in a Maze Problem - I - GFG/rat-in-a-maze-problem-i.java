//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        boolean[][] visited =  new boolean[n][n];
        ArrayList<String> ans = new ArrayList<>();
        dfs(0, 0, visited, ans, m,n, "");
        return ans;
    }
    public static void dfs(int row, int col, boolean[][] visited, ArrayList<String> ans , int[][] m, int n, String ansf){
        
        if(row < 0 || row >= n || col < 0 || col >= n || visited[row][col] == true ||m[row][col] == 0) return ;
        
        if(row == n-1 && col == n-1) {
            ans.add(ansf);
            visited[row][col] = false;
            return;
        }
        
        visited[row][col] = true;
        dfs(row+1, col, visited ,ans, m, n, ansf + "D");
        dfs(row-1, col, visited ,ans, m, n, ansf + "U");
        dfs(row, col+1, visited ,ans, m, n, ansf + "R");
        dfs(row, col-1, visited ,ans, m, n, ansf + "L");
        visited[row][col] = false;
        
        
        
    }
}