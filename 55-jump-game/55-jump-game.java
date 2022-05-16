class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        boolean[] arr = new boolean[n];
        
        arr[n-1] = true;
        for(int i = n-2; i>=0; i--){
            if(nums[i] == 0)
                arr[i] = false;
            else{
                int f = 1;
                for(int start = i+1 ; start <= Math.min(nums[i]+i , n-1);start++){
                    if(arr[start] == true){
                        f = 0;
                        break;
                    }
                }
                if(f == 0) arr[i] = true;
                else arr[i] = false;
            }
            
            
            
            
        }
        return arr[0];
    }
}