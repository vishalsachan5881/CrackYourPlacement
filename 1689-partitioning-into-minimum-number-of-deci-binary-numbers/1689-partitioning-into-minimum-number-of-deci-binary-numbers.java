class Solution {
    public int minPartitions(String n) {
       
        char c = '0';
        for(int i = 0 ; i <n.length();i++){
            if(c < n.charAt(i))
            {
                c = n.charAt(i);
                
            }
        }
        return c-'0';
    }
}