class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(var v : piles) pq.add(v);
        while(pq.size() != 0 && k > 0){
            int fe = pq.poll();
            pq.add(fe-(fe/2));
            k--;
        }
        int sum = 0;
        while(pq.size()>0) sum+=pq.poll();
        return sum;
    }
}