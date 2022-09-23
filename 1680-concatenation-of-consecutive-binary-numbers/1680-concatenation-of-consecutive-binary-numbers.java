class Solution {
   static int power(int x, int y, int p)
  {
    int res = 1; // Initialize result
 
    x = x % p; // Update x if it is more than or
    // equal to p
 
    if (x == 0)
      return 0; // In case x is divisible by p;
 
    while (y > 0)
    {
 
      // If y is odd, multiply x with result
      if ((y & 1) != 0)
        res = (res * x) % p;
 
      // y must be even now
      y = y >> 1; // y = y/2
      x = (x * x) % p;
    }
    return res;
  }
    public int concatenatedBinary(int n) {
          long[] ans = new long[100001]; 
        int M = 1000000007;
        ans[1] = 1;
        for(int i =2 ; i <= n ; i++){
            int d = (int)((Math.log(i)/ Math.log(2)))+1;
           
           ans[i] = ((ans[i-1] << d) + i)%1000000007;
 // System.out.println(d + "  "+ t + " "+pow(2,d,1000000007) + " " + ans[i]);
        }
        return (int)ans[n];
    }
}