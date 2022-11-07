class Solution {
    public int maximum69Number (int num) {
        String s = num+"";
        int a = s.indexOf('6');
        if(a < 0) return num;
        return new Integer(s.substring(0,a) + '9' + s.substring(a+1));
        
    }
}