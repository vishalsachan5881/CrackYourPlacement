class Solution {
    public int tribonacci(int n) {
        int a = 0, b = 1, c = 1;
        int res = 0;
        for(int i = 3 ; i <= n ; i++){
            res = a+b+c;
            a = b;
        b = c;
            c = res;
            
        }
        if(n == 1 || n == 2) return 1;
        return res;
    }
}