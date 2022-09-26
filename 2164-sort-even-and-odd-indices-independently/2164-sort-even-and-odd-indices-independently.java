class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        PriorityQueue<Integer> p2 = new PriorityQueue<>();
        PriorityQueue<Integer> p1 = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int  v  = 0 ;  v < n ; v++){
            if(v%2==0)
                p2.offer(nums[v]);
            else p1.offer(nums[v]);
        }
        int[] ans = new int[n];
        int i = 0 ; 
        for(int  v  = 0 ;  v < n ; v++){
            if(v % 2 == 0) ans[i++] = p2.poll();
            else ans[i++] = p1.poll();
        }
        return ans;
    }
}