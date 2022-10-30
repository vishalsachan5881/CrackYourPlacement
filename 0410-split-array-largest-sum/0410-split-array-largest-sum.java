class Solution {
    public int splitArray(int[] nums, int k) {
        int sum = 0, min = 1000000, max = 0;
        
        for(var v : nums){
            sum+=v;
            min = Math.min(min, v);
            max = Math.max(max, v);
        }
        if(k == nums.length) return max;
        int ans =  0 ;
        int low = max, high = sum;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(fn(nums, k, mid))
            {
                ans = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return ans;
        
    }
    public boolean fn(int[] nums, int k , int sum){
        int temp =0, sub = 1;
        for(var v : nums){
             temp += v;
            if(temp > sum){
                sub++;
                temp = v;
            }
        }
        return sub <= k;
    }
}