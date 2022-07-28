class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c1  = s.toCharArray();
        char[] c2  = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        return (new String(c1).equals(new String(c2)));
        
    }
}