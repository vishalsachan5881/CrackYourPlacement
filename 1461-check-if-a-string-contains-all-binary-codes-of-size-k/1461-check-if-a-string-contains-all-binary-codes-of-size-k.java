class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> st = new HashSet<>();
        int l = 0, r = k-1;
        while(r<s.length()){
            String ss  = s.substring(l,r+1);
            st.add(ss);
            l++;r++;
        }
        return (st.size() == Math.pow(2,k));
    }
}