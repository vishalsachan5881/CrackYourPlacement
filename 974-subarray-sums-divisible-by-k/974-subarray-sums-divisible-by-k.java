class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>(); // remainder,frequency
        map.put(0,1);  //to handle 0 remainder
        int sum =0;
        int rem =0;
        int subArr=0;
        
        for(int a : nums ){
            sum += a;
            rem = sum%k;
            
            if(rem<0)
                rem += k;   // kn-y -->   kn-y+k-k  --->  k(n-1)+k-y  ---> y=k+y
            if(map.containsKey(rem) ){
                subArr += map.get(rem);
                map.put(rem,map.get(rem)+1 );
            }
            else
                map.put(rem,1);
        }
        return subArr;
    }
}