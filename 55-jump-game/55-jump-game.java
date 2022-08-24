class Solution {
   public boolean canJump(int[] nums) {
    int[] dp = new int[nums.length];
    Arrays.fill(dp ,-1);
    return helper(0, nums, dp);
}

public boolean helper(int index, int[] nums, int[] dp){
    if(index == nums.length-1) return true;
    if(dp[index] != -1) return dp[index] == 1;
    for(int i=1; i<=nums[index]; i++){
        boolean current = helper(index+i, nums, dp);
        dp[index] = (current == true ? 1 : 0);
        if(current == true) return true;
    }
    return false;
}
}