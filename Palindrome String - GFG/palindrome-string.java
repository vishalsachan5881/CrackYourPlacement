//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    boolean help(String ss, int s, int e){
        if(s<=e){
            return ss.charAt(s) == ss.charAt(e) && help(ss, s+1, e-1);
        }
        return true;
    }
    int isPalindrome(String ss) {
        int s = 0, e = ss.length()-1;
        return (help(ss , s, e)==true ? 1:0 );
    }
};