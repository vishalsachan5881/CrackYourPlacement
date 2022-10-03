class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int n = name.length();
        int m = typed.length();
        
        int i = 0 , j = 0 ;
        if(m<n) return false;
        while(j < m && i<n){
            char nch = name.charAt(i);
            char tch = typed.charAt(j);
            
            if(nch == tch){
                i++;
                j++;
            }
            else{
                if(j>0 && tch == typed.charAt(j-1)) j++;
                else return false;
            }
        }
        if(i==n&&j==m) return true;
                
        

       if(j<m){
           char tch = name.charAt(n-1);
           while(j<m){
               if(tch != typed.charAt(j)) {System.out.println("haa"+j+""+i+" "+m);return false;}
               j++;
           }
       }
        
        if(i<n) return false;
    return true;
    }
    }
