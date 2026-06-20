class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int sum=0;
        int total=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>max)max=sum;
            if(sum<0)sum=0;
            total+=nums[i];
        }

        sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum<min)min=sum;
            if(sum>0)sum=0;

        }
        if(max<0)return max;
        return Math.max(max,total-min);
    }
}