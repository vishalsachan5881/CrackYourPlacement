class Solution {
  public String countAndSay(int n){ 
		if(n == 1) return "1";  
		
		String s = countAndSay(n-1);  
		StringBuilder str = new StringBuilder(); 
		
		int count = 1 , i = 0; 
		
		while(i < s.length()){ 
		
			char ch = s.charAt(i++); 
			
			while(i < s.length() && s.charAt(i) == ch){ 
				i++;    count++;
			}
			
			str.append(count).append(ch); 
			count = 1; 
		}
		
	return str.toString(); // return str as string
}
}