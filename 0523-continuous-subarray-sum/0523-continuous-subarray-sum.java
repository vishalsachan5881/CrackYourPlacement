class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,-1);
        long sum = 0;
        for(int i = 0 ; i < nums.length; i++){
            int v = nums[i];
            sum+=v;
            int rem = (int)sum%k;
            if(hm.containsKey(rem)) {
                if( i - hm.get(rem) > 1) return true;
            }
            else
            hm.put(rem, i);
        }
        
        return false;
    }
}