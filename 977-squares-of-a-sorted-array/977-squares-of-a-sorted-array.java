class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int f = 0 , j = nums.length-1;
        for(int i  =  nums.length-1;i>=0;i--){
            int sql = nums[f]*nums[f];
            int sqr = nums[j]*nums[j];
            if(sql>=sqr)
                {ans[i] = sql;f++;}
            else
                {ans[i] = sqr;j--;}
        }
        return ans;
    }
}