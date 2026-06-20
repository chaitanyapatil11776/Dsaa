class Solution {
    public int maxProfit(int[] prices) {
        int minp=prices[0];
        int maxp=0;
        for(int i=0;i<prices.length;i++){
            minp=Math.min(minp,prices[i]);
            maxp=Math.max(maxp,prices[i]-minp);
        }
        return maxp;
    }
}