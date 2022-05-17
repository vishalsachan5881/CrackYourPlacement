class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1, p2 = n-1, length = m+n-1;
        while(p1 >= 0 && p2 >= 0){
            if(nums1[p1] >= nums2[p2]){
                nums1[length] = nums1[p1];
                p1--;
            }else{
                nums1[length] = nums2[p2];
                p2--;
            }
            length--;
        }
        
        if(p1 >= 0){
             while(length>=0){
                 nums1[length] = nums1[p1];
                 p1--;
                 length--;
             }
        }
        if(p2 >= 0){
             while(length>=0){
                 nums1[length] = nums2[p2];
                 p2--;
                 length--;
             }
        }
    }
}