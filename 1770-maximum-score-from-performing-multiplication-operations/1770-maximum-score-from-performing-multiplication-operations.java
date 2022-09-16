class Solution {
    int dp[][]=new int[1000][1000];
    public int maximumScore(int[] nums, int[] multipliers) {
      int n=nums.length;
      //  int m=multipliers.length;
        for(int x[]:dp)
        Arrays.fill(x,Integer.MIN_VALUE);
        return solve(0,nums,multipliers,0,n-1);
    }
    int solve(int i,int nums[],int mul[],int left,int right){
        if(i==mul.length)
            return 0;
        if(dp[left][i]!=Integer.MIN_VALUE)
            return dp[left][i];
        int op1=mul[i]*nums[left]+solve(i+1,nums,mul,left+1,right);
        int op2=mul[i]*nums[right]+solve(i+1,nums,mul,left,right-1);
        dp[left][i]=Math.max(op1,op2);
        return dp[left][i];
    }
}