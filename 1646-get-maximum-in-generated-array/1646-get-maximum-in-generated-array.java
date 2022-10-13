class Solution {
    public int getMaximumGenerated(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        
        int[] temp  = new int[n+1];
        temp[0] =0; temp[1] = 1;
        
        for(int i = 2 ; i < n+1; i++){
            int half = i/2;
            
            if(i%2==0){
                temp[i] = temp[half];
            }else{
                temp[i] = temp[half] + temp[half+1];
            }
        }
        int maxi = -1;
        for(var v: temp) maxi = Math.max(maxi,v);
        
        return maxi;
    }
}