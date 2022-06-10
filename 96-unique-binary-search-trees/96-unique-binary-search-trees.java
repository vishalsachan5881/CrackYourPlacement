class Solution {
    public int catalan(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i  = 2; i<=n;i++){
            int sum = 0;
            for(int j =0,k=i-1;j<i;j++,k--){
                sum+=(dp[j]*dp[k]);
            }
            dp[i] = sum;
        }
        
        return dp[n];
    }
    public int numTrees(int n) {
        return catalan(n);
    }
}