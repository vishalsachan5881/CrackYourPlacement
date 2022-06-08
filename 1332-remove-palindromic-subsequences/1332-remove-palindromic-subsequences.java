class Solution {
    public boolean isPal(String s){
        int f= 0 ,l = s.length()-1;
        while(f<=l){
            if(s.charAt(f)==s.charAt(l)){
                f++;l--;
            }   else return false;
        }
        return true;
    }
    public int removePalindromeSub(String s) {
        if(isPal(s))
            return 1;
        
            return 2;
    }
}