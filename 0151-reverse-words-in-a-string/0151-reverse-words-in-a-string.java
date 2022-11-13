class Solution {
    public String reverseWords(String s) {
        //s = s.trim();
        int n = s.length();
        Stack<String> st = new Stack<>();
        String bs = "";
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c==' '){
                st.push(bs);
                bs = "";
                
            }
            else 
                 bs+=c;
        }
        st.push(bs);
        //System.out.print(st.get(1));
        String ans = "";
        while(!st.isEmpty()){
            String ss = st.pop();
            if(!ss.equals(""))
            ans += (ss+" ");
            else
                continue;
        }
        
        
        return ans.trim();
        
    }
}