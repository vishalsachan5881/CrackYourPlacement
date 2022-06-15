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
        int[][] dp = new int[n][n+1];
        for(int i  = 0;i<n;i++)
            for(int j = 0; j<n+1;j++)
                dp[i][j] = -1;
        return fn(nums, 0, -1,dp);
    }
}