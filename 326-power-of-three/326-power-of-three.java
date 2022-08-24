class Solution {
    public boolean fn(int n){
        if(n==1) return true;
        if(n<3) return false;
        return (n%3==0 && fn(n/3));
    }
    public boolean isPowerOfThree(int n) {
        if(n==1) return true;
        return fn(n);
    }
}