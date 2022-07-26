class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length, ans = 0, count = 0;
        for(int i = 0, j = 0 ; i < n;i++){
            
            if(nums[i] == 1) {
                ans = Math.max(ans,i-j+1);
            } 
            
            else{
                count++;
                if(count > k)
                while(count > k){
                    if(nums[j] == 0) count--;
                    j++;
                }
                else
                    ans = Math.max(ans, i-j+1);
            }
        }
        return ans;
    }
}