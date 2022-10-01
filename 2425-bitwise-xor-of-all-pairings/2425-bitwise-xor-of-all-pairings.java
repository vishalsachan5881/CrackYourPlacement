class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int xor1=0, xor2 = 0;
        for(var v : nums1)
            xor1^=v;
        for(var v : nums2)
            xor2^=v;
        System.out.println(xor1 + " " + xor2);
        if(n%2 == 0 && m % 2 == 0)
            return 0;
        if(n%2!=0 && m%2!=0) return xor1^xor2;
        if(n%2==0) return xor1;
        if(m%2==0) return xor2;
        return 0;
    }
}