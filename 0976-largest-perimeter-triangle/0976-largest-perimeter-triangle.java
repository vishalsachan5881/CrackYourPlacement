class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
       int i = 0, peri = 0; 
        while(i+2 < nums.length)
            {if(nums[i+2] < nums[i+1]+nums[i])
                peri = Math.max
            (nums[i+2] + nums[i+1]+nums[i] , peri);
             
             i++;
        }
        return peri;
    }
}