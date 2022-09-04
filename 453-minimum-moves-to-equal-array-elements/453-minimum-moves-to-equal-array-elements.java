class Solution {
    public int minMoves(int[] nums) {
        int sum = 0,mini = Integer.MAX_VALUE;
        for(var v : nums){
            sum+=v;
            mini = (int)Math.min(mini, v);
        }
        return sum - mini*nums.length;
    }
}