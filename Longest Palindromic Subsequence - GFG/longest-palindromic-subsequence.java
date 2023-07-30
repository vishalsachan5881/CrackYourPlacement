//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.longestPalinSubseq(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int fn(String a, String b, int ai, int bi, int[][] dp){
        // System.out.println(a + " " + b + " " + ai + " " + bi);
        if(ai  < 0 || bi < 0) return 0;
        
        
        if(dp[ai][bi] != -1) return dp[ai][bi];
        if(a.charAt(ai) == b.charAt(bi)) 
            return dp[ai][bi] = 1 + fn(a,b ,ai-1, bi-1, dp);
        
            return dp[ai][bi] = Math.max(fn(a,b, ai, bi-1,dp), fn(a,b, ai-1, bi,dp));
        
    }
    public int longestPalinSubseq(String s)
    {
        //code here
        String b = new StringBuilder(s).reverse().toString();
    
        // System.out.println(b);
        int n = s.length()-1;
        int[][] dp = new int[n+2][n+2];
        for(int i = 0 ; i < n+2 ; i++) for(int j = 0 ; j < n + 2 ;j++) dp[i][j] = -1;
         fn(s,b, n, n, dp);
         return dp[n][n];
         
        
        
    }
}