class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        //st.push(nums[n-2]);
        
        for(int i = n-2; i>=0 ;i--){
            while(!st.isEmpty() && st.peek() <= nums[i])
                st.pop();
            
            st.push(nums[i]);
        }
        
        //System.out.println(st.toString());
        int[] ans = new int[n];
        //st.push(nums[n-1]);
        for(int i = n-1 ; i>=0;i--){
            while(!st.isEmpty() && st.peek() <= nums[i])
                st.pop();
            ans[i] = st.size()==0 ? -1 : st.peek();
            st.push(nums[i]); 
        }
        return ans;
        }
    }
