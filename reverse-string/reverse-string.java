class Solution {
    
    public void fn(char[] s, int a, int b){
        if(a<=b)
            return;
        
        //swap(s,a,b);
        char c = s[a];
        s[a] = s[b];
        s[b] = c;
        fn(s,a-1,b+1);
    }
    public void reverseString(char[] s) {
        fn(s,s.length-1,0);
    }
}