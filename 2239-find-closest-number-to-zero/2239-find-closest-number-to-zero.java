class Solution {
    public int findClosestNumber(int[] nums) {
        int t = Integer.MIN_VALUE, ans = Integer.MAX_VALUE;
        for(int i =  0; i < nums.length; i++){
            int temp = Math.abs(nums[i]-0);
            if(temp < ans)
            {
                ans = temp;
                t = nums[i];
            }
            else if(temp == ans)
            {
                t = Math.max(t, nums[i]);
            }
        }
        return t;
    }}