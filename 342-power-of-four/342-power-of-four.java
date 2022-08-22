class Solution {
    public boolean fn(int n,int rem){
        if(n==0 || (n==1 && rem !=0)) return false;
        if(n==1 && rem ==0 ) return true; 
        
        int r= n%4;
        return fn(n/4,rem+r);
    } 
    public boolean isPowerOfFour(int n) {
        //return ((Math.log(n)/Math.log(4))%1) == 0;
        if(n==1) return true;
        return fn(n,0);
    }
}