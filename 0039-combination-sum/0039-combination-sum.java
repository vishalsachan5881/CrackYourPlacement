class Solution {
    public void fn(int ind, List<List<Integer>> ans, List<Integer> ls , int[] arr, int t){
        if(t == 0)
        {
            ans.add(new ArrayList<>(ls));
            return;
        }
        if( ind >= arr.length) return;
        
        
        if(arr[ind] <= t){
            ls.add(arr[ind]);
            fn(ind, ans, ls, arr, t-arr[ind]);
            ls.remove(ls.size()-1);
        }
        
        fn(ind+1, ans ,ls, arr, t);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        
        fn(0, ans, ls, candidates, target);
        return ans;
    }
}