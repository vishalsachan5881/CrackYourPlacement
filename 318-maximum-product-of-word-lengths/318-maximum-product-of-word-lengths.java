class Solution {
    public int get(String s){
        int temp = 0;
        for(int i = 0 ; i<s.length(); i++){
            int t = s.charAt(i)-'0';
            int st = 1<<t;
            temp |= st;
            
        }
        return temp;
    } 
    public int maxProduct(String[] words) {
        int n   = words.length;
        int[] state = new int[n];
        
        for(int i = 0 ; i<n; i++){
            
                state[i] = get(words[i]);
            
        }
        
        int ans = 0;
        for(int i = 0;i<n; i++){
            for(int  j = i+1; j<n;j++){
                if((state[i] & state[j]) == 0){
                    ans = Math.max(ans, words[i].length() * words[j].length());    
                }
                
            }
        }
        
        
        return ans;
    }
}