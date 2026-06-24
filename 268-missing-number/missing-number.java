class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        int k=(nums.length*(nums.length+1))/2;
        int y=k-sum;
        return y;
    }
}