class Solution {
    public int majorityElement(int[] nums) {
        int c = 0 , var = -1, n =  nums.length;
        for(int i = 0 ; i < n ; i++){
            if(c==0) {var = nums[i];c++;}
            else{
                if(var == nums[i]) c++;
                else c--;
            }
        }
        return var;
    }
}