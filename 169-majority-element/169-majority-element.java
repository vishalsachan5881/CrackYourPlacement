class Solution {
    public int majorityElement(int[] nums) {
        int n  =  nums.length;
        int ct = 0, element = 0;
        for(int i = 0;i<n; i++){
            if(ct == 0) element = nums[i];
            if(element == nums[i]) ct++;
            else ct--;
        }
        return element ; 
    }
}                                                                  
