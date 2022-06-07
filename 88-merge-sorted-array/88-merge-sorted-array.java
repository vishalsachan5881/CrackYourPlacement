class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int total  =m+n-1;
        m = m-1;n=n-1;
        while(total>=0 && m >=0 && n>=0){
            if(nums1[m]<=nums2[n]){
                nums1[total] = nums2[n];
                n--;
                total--;
            }else{
                nums1[total] = nums1[m];
                m--;
                total--;
            }
        }
        while(m>=0&&total>=0)
        {
            nums1[total] = nums1[m];
            m--;
            total--;
        }
        
        while(n>=0&&total>=0)
        {
            nums1[total] = nums2[n];
            n--;
            total--;
        }
        
    }
}