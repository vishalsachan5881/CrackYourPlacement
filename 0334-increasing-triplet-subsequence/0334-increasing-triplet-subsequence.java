class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        int[] rt = new int[n];
        rt[n-1] = nums[n-1];
        for(int i = n-2; i>=0;i--)
            rt[i]  = Math.max(rt[i+1], nums[i]);
        
       boolean ans = false;
        
        
       TreeSet<Integer> ts = new TreeSet<>();
        ts.add(nums[0]);
        for(int i = 1; i < n ; i++){
            if(ts.lower(nums[i]) == null){
                
            ts.add(nums[i]);
                continue;}
            else
               {
                
                if(rt[i] > nums[i]) return true;
           }
            ts.add(nums[i]);
        }
        
        return false;
    }
}