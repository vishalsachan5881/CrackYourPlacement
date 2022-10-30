class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max  = 0, sum = 0;
        for(var v: weights)
        {
            max = Math.max(max, v);
            sum += v;
        }
        int ans = 1;
        int low = max, high = sum;
        while(low <= high){
            
            int mid = low+(high-low)/2;
            int d = fn(mid, weights);
            if(d > days)
                low = mid+1;
            else {
                ans  = mid; 
                high = mid-1;
            }
        }
        return ans;
    }
    
    public static int fn(int mid, int[] nums){
        int sum = 0, day = 1;
        for(var v : nums){
            sum += v;
            if(sum > mid){
                day++;
                sum = v;
            }
        }
        return day;
    }
}