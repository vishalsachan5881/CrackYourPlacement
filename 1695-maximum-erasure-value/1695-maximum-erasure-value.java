class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> hm = new HashSet<>();
        int n = nums.length, l = 0 , r = 0, sum = 0 , ans = -1;
        while(r<n){
            if(hm.contains(nums[r]))
            {
                while(nums[l] != nums[r]){
                    sum -= nums[l];
                    hm.remove(nums[l]);
                    l++;
                }
                sum -= nums[l];
                l++;
            }
                sum+= nums[r];
                ans  = Math.max(ans,sum);
                hm.add(nums[r]);
                r++;
            
        }
        return ans;
    }
}