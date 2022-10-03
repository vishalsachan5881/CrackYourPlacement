class Solution {
    public int maxArea(int[] height) {
        int i = 0 , n = height.length,  j = n-1;
        int max = Integer.MIN_VALUE;
        while(i < j ){
            System.out.println(i + "  " + j );
            int wd = j - i ;
            int ht = Math.min(height[i], height[j]);
            
            max = Math.max(max, wd*ht);
            
            if(height[i] == height[j]){
                i++;
                j--;
            }
            else if(height[i] > height[j])
                j--;
            else i++;
        }
        return max;
    }
}