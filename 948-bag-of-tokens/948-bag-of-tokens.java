class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int n = tokens.length;
        if(n==0 || tokens[0] > power  ) return 0;
        //int n = tokens.length;
        int score =0 ,l = 0 , h = n-1;
        while(l<=h){
            
            
            if(power >= tokens[l]){
                score++;
                power -= tokens[l];
                l++;
            }
            
            else if(l + 1 < h) {
                score--;
                
                power += tokens[h];
                h--;
            }
            else return score;
        }
        return score;
    }
}