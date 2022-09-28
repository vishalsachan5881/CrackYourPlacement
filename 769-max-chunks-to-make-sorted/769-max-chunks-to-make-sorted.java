class Solution {
    public int maxChunksToSorted(int[] arr) {
        
        int max  = -1, c=  0 ;
        for(int i = 0 ; i < arr.length ;i++){
            max = Math.max(max, arr[i]);
            if(i == max) c++;
        }
        return c;
    }
}