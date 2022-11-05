class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0 , n = nums.length, h = n-1, f = 0;
        while(l<=h){
            int mid = l + (h-l)/2;
            if(nums[mid] == target) {h = mid - 1;f = 1;}
            else if(nums[mid] > target) h = mid-1;
            else l = mid + 1;
        }
        int[] ans = new int[2];
        ans[0] = (f == 0) ? -1:l;
        f = 0;
        l = 0; h= n-1;
        while(l<=h){
            int mid = l + (h-l)/2;
            if(nums[mid] == target) {l = mid + 1 ; f = 1;}
            else if(nums[mid] > target) h = mid-1;
            else l = mid + 1;
        }
        ans[1] = (f == 0) ? -1:h;
        return ans;
     }
}