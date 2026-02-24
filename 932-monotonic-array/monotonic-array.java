class Solution {
    public boolean isMonotonic(int[] nums) {


        boolean incre=true;
        boolean dece=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                dece=false;
            }else if(nums[i]>nums[i+1]){
            incre=false;
            }
        }
        return incre || dece;
    }
}