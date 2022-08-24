class Solution {
    public boolean fn(int[] nums, int ind,Boolean[] hm){
        
         
        if(ind == nums.length-1) return true;
        if(ind >= nums.length || nums[ind] == 0) return false;
        
        if(hm[ind] != null)  return hm[ind];
        boolean min = false;
        for(int i = 1 ; i <= nums[ind];i++){
             if(fn(nums, ind+i,hm))
                 return hm[ind] = true;
        }
        return hm[ind] = min;
        
    }
    public boolean canJump(int[] nums) {
        //int ind = nums.length-1;
         Boolean[] hm = new Boolean[nums.length+1];
         if(nums.length==1) return true;
         Arrays.fill(hm,null);
         fn(nums,0,hm);
         System.out.println(hm[0]);
         if(hm[0] == null) return false;
         return hm[0];
    }
}