class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> hs = new HashSet<>();
        int l  = 0, r = 0, count =  0;
        while(r<s.length()){
            if(!hs.contains(s.charAt(r)))
            {
                hs.add(s.charAt(r));
                r++;
            }else{
                while(s.charAt(l)!=s.charAt(r)){
                    hs.remove(s.charAt(l));
                    l++;
                }
                
                l++;
                hs.add(s.charAt(r));
                r++;
                
            }
            count = Math.max(count,r-l);
        }
        return count;
    }
}