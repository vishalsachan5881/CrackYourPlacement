class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int n = nums.length;
        int count  =0, ans = -1 ;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 0) {
                ans = Math.max(count, ans);
                count = 0;
            }else{
                count++;
            }
        }
        return Math.max(ans, count);
    }
}