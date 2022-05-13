class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n-1;
        int water=0;
        while(i < j){
             int w = j-i;
            int h = Math.min(height[i], height[j]);
            water =  Math.max(water , h*w);
            
            
            if(height[i] <height[j])
                i++;
            else
                j--;
        }
        
        return water;
    }
}