class Solution {
    public int minMoves(int target, int maxDoubles) {
        int ans = 0;
        while(target>1){
            if(maxDoubles == 0){
                ans+=target-1;
                target = 0;
            }else{
                if(target%2==0){
                    ans++;
                    target/=2;
                    maxDoubles--;
                }else{
                    target -= 1;
                    ans++;
                }
                
            }
        }
        return ans;
    }
}