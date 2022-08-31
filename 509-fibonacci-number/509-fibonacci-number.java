class Solution {
    public int fib(int n) {
        int a = 0 , b = 1, res = 0 ;
        for(int i = 2 ; i < n+1;i++){
            res = b+a;
            a = b;
            b = res;
        }
        if(n == 1) return 1;
        return res;
    }
}