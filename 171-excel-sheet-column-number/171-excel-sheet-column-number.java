class Solution {
    public int titleToNumber(String s) {
        int n  = s.length();
        int ans = 0;
        for(int pow = 0,i = n-1; i>=0;i--,pow++){
            char ch = s.charAt(i);
            int cha = ch-'A';
            //System.out.println(ch+" "+pow+" "+cha);
            ans +=( (int)Math.pow(26,pow) * (cha+1));
        }
        return ans;
    }
}