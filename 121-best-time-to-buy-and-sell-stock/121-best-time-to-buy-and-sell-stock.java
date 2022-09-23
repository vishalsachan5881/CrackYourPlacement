class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0 ;
        int min = Integer.MAX_VALUE;
        for(var v : prices){
            min = Math.min(min, v);
            profit = Math.max(profit , v - min);
        }
        return profit;
    }
}