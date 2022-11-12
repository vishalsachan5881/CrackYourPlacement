class Solution {
    public int removeDuplicates(int[] nums) {
        int p = 1, n = nums.length ;
        for(int i = 1; i < n;i++){
            if(nums[p-1] != nums[i]){
                nums[p] = nums[i];
                p++;
            }
        }
        return p;
    }
}