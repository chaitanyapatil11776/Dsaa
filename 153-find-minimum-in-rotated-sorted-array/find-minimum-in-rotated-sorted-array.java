class Solution {
    public int findMin(int[] nums) {
        int min=nums[0];
        for(int  i:nums){
            if(i<min){
                min=i;
            }

            

        }
        return min;
    }
}