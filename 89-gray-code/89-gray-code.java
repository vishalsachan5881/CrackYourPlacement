class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i<(int)Math.pow(2,n);i++)
            ans.add(i ^(int)Math.floor(i/2));
        return ans;
    }
}