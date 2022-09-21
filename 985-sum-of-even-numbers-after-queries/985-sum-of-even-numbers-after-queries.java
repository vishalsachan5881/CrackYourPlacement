class Solution {
    public void print(int[] nums){
        for(var v : nums)
            System.out.print(v+" ");
        
        System.out.println();
    }
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int even = 0, odd = 0;
        for(var v : nums)
            if(v%2 == 0) even+=v;
            else odd+=v;
        
        int n = queries.length, j = 0 ;
        int[] ans = new int[n];
        for(int i = 0 ; i < n;i++){
            int val = queries[i][0];
            int index = queries[i][1];
            
            if(val%2 != 0 && nums[index]%2!=0){
                even = even + nums[index] + val;
                
            }
            else if (val % 2 !=0 && nums[index] % 2 == 0 ){
                even -= nums[index];
               
            }
            else if(val % 2 ==0 && nums[index]%2 == 0){
                even += val;
                
            }
            ans[j++] = even;
                nums[index] += val;
        }
        return ans;
    }
}