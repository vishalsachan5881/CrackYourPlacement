class Solution {
    public boolean isUgly(int n) {
        return n!=0?((n%2==0)?isUgly(n/2):((n%3==0)?isUgly(n/3):((n%5==0)?isUgly(n/5):n==1))):false;
    }
}