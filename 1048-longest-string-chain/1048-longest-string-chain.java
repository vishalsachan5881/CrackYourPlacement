class Solution {
    public boolean compare(String s1 ,String s2){
        if(s2.length()+1 != s1.length()) return false;
        
        int i = 0 , j = 0;
        while(i < s1.length()){
            if(j <s2.length() && s1.charAt(i) == s2.charAt(j))
            {
                i++;j++;
            }else i++;
        }
        if(i == s1.length() && j == s2.length()) return true;
        return false;
    }
    public int longestStrChain(String[] arr) {
        Arrays.sort(arr, (a,b) -> {return a.length() - b.length();});
        int n  = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        for(int i  = 0 ; i<n;i++)
            for(int j = 0 ; j<i; j++)
                if(compare(arr[i], arr[j]))
                    dp[i] =  Math.max(dp[i], dp[j]+1);
        
        int max  =1;
        for(var v : dp)
            max = Math.max(max, v);
        
        return max;
    }
}