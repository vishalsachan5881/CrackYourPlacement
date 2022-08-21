class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for(var v: operations){
            if(v.charAt(1) == '+') ans++;
            else ans--;
        }
        return ans;
    }
}