class Solution {
    
    
    public boolean fn(String a, String b){
        
        if(a.length() != b.length()+1) return false;
        
        int i = 0, j = 0;
        while(i < a.length()){
            
            if(j<b.length() && a.charAt(i) == b.charAt(j))
            {
                i++;
                j++;
            }else{
                i++;
            }
        }
        
        if( i == a.length() && j == b.length()) return true;
        return false;
        
        
        
        
    }
    public int longestStrChain(String[] words) {
        int n = words.length;
        Arrays.sort(words,(a,b)->a.length()-b.length());
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        for(int i = 0 ;i<n;i++)
            for(int j = 0 ; j<i; j++)
                if(fn(words[i] , words[j]))
                    dp[i] = Math.max(dp[i], dp[j]+1);
        
        int max = Integer.MIN_VALUE;
        for(var v : dp)
            max = Math.max(v, max);
        
        return max;
    }
}