class Solution {
    public int fn(int nums[], int ind, int prev,int[][] dp){
        if(ind == nums.length) return 0;
        if(dp[ind][prev+1] != -1) return dp[ind][prev+1];
        int l1 = fn(nums, ind+1, prev, dp);
        if(prev == -1 || nums[ind] > nums[prev])
           l1 = Math.max(l1 , 1+fn(nums, ind+1, ind, dp));
      dp[ind][prev+1]=l1;
        return l1;
    }
    public int lengthOfLIS(int[] nums) {
        int n  = nums.length;
        int[][] dp = new int[n+1][n+1];
        for(int ind  = n-1; ind>=0;ind--)
            for(int prev = ind-1 ; prev>=-1;prev--)
            {
                int l1=  dp[ind+1][prev+1];
                   if(prev == -1 || nums[ind] > nums[prev]) 
                       l1  = Math.max(l1, 1+dp[ind+1][ind+1]);
                
                dp[ind][prev+1] = l1;
            }
    return dp[0][0];
    }
}