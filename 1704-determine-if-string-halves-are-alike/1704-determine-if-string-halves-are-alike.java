class Solution {
    public boolean isV(char c){
        if(c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'o' || c == 'O'|| c == 'U' || c == 'u')
            return true;
        return false;
    }
    public boolean halvesAreAlike(String s) {
        int lc = 0, rc  =0 ;
        int ind = s.length()/2 - 1;
        
        for(int i = 0 ; i <= ind ; i++)
            if(isV(s.charAt(i))) lc++;
        
        for(int i = ind+1; i < s.length() ; i++)
            if(isV(s.charAt(i))) rc++;
        
        return lc == rc;
    }
}