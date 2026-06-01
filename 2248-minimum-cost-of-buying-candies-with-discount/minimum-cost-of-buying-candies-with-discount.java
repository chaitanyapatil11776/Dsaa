class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int totalcost=0;
        int count=0;
        for(int i=cost.length-1;i>=0;i--)
        {
            count++;
            if(count%3==0){
                continue;
            }
            totalcost+=cost[i];
        }
        return totalcost;
    }
}