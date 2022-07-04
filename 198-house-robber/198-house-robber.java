class Solution {
    public int fn(int index , int[]nums, int[]dp){
        if(index < 0) return 0;
        if(index == 0) return dp[index] = nums[0];
        if(dp[index] != -1) return dp[index];
        int taken = nums[index] + fn(index-2 , nums,dp);
        int notTaken = fn(index-1, nums,dp);
        
        return dp[index] = Math.max(taken, notTaken);
    }
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return fn(nums.length-1, nums, dp);
    }
}