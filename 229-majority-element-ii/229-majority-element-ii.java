class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        int n = nums.length, num1 = -1, num2 = -1, c1  = 0 , c2 = 0;
        for(var v : nums){
            if(v == num1) c1++;
            else if(v==num2) c2++;
            else if(c1 == 0){
                num1 = v;
                c1 = 1;
            }
            else if(c2 == 0){
                num2 = v;
                c2 = 1;
            }
            else {
                c1--;
                c2--;
            }
        }
        c1 = 0 ; c2 = 0;
        for(var v : nums){
            if(v == num1) c1++;
            else if(v==num2) c2++;
        }
        
        int par = (int)Math.floor(n/3);
        if(c1 > par) ls.add(num1);
        if(c2> par) ls.add(num2);
        return ls;
    }
    
}