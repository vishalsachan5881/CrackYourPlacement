class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0  , h = arr.length-1;
        while(h-l+1 != k){
            if(Math.abs(arr[l] - x) <= Math.abs(arr[h] - x))
                h--;
            else l++;
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = l; i <= h; i++)
        ans.add(arr[i]);
        return ans;
    }    
}