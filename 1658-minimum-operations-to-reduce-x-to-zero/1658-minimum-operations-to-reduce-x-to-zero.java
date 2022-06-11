class Solution {
    static int lenOfLongSubarr(int[] arr, int n, int k)
      {
             // HashMap to store (sum, index) tuples
             HashMap<Integer, Integer> map = new HashMap<>();
             int sum = 0, maxLen = 0;
 
             // traverse the given array
             for (int i = 0; i < n; i++) {
                 
                  // accumulate sum
                  sum += arr[i];
                 
                  // when subarray starts from index '0'
                  if (sum == k)
                      maxLen = i + 1;
 
                  // make an entry for 'sum' if it is
                  // not present in 'map'
                  if (!map.containsKey(sum)) {
                      map.put(sum, i);
                  }
 
                  // check if 'sum-k' is present in 'map'
                  // or not
                  if (map.containsKey(sum - k)) {
                       
                      // update maxLength
                      if (maxLen < (i - map.get(sum - k)))
                          maxLen = i - map.get(sum - k);
                  }
             }
              
             return maxLen;            
      }
    public int minOperations(int[] nums, int x) {
        int n = nums.length, p = 0;
        for(int v : nums)
            p+=v;
        int ans = lenOfLongSubarr(nums,n,p-x);
        System.out.println(p);
        if(p==x) return n;
        return (ans == 0) ? -1 : n-ans;
    }
}