class Solution {
  public String countAndSay(int n){ 
		if(n == 1) return "1";  
		
		String s = countAndSay(n-1);  
		StringBuilder str = new StringBuilder(); 
		
		int count = 1  ;int i  = 0 ;
      for( i = 1 ; i < s.length() ; i++)
      {
          if(s.charAt(i) == s.charAt(i-1)) count++;
          else{
              str.append(count).append(s.charAt(i-1));
              count = 1;
          }
      }
      str.append(count).append(s.charAt(i-1));
		
		
	return str.toString(); // return str as string
}
}