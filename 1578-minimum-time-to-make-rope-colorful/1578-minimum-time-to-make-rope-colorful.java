class Solution {
    public int minCost(String colors, int[] time) {
        int l = 0, r = 0;
        int n = colors.length();
        int sum = 0, max = -1,ans = 0;
        while(r < n){
            if(colors.charAt(l) == colors.charAt(r))
            {
                sum+=time[r];
                max = Math.max(max, time[r]);
                r++;
                
            }
            else{
                int mid = r - l;
                if(mid != 1)
                    ans+=(sum-max);
                
                l = r;
                sum = 0;
                max = -1;
            }
        }
        if(l!=r){
            int mid = r - l;
                if(mid != 1)
                    ans+=(sum-max);
                
                l = r;
                sum = 0;
                max = -1;
        }
        return ans;
    }
}