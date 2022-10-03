class Solution {
    public int mostFrequentEven(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(var v : nums){
            if((v&1)==0){
                hm.put(v,hm.getOrDefault(v,0)+1);
            }
        }
       int fre = -1, ans = (int)1e6;
        for(var v : hm.keySet()){
            if(hm.get(v) == fre) ans = Math.min(v, ans);
            if(hm.get(v) > fre){
                ans = v;
                fre = hm.get(v);
            }
        }
       if(ans < (int)1e6) return ans;
        else return -1;
    }
}