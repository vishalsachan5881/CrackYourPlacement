class Solution {
    public int bound(LinkedList<Integer> ls, int key){
        int ind = Collections.binarySearch(ls, key);
        if(ind < 0)
            return Math.abs(ind)-1;
        else
            return ind;
    }
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        LinkedList<Integer> ls = new LinkedList<>();
        ls.addFirst(nums[0]);
        for(int i = 1; i<n;i++)
        {
            if(ls.getLast() < nums[i])
                ls.add(nums[i]);
            else{
                int ii = bound(ls, nums[i]);
                ls.set(ii ,nums[i]);
            }
        }
        return ls.size();
    }
}