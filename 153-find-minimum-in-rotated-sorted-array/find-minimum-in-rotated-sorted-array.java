class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int hight=nums.length-1;
        while(low<hight){
            int mid=low+(hight-low)/2;
            if(nums[mid]>nums[hight]){
                low=mid+1;
            }else{
                hight=mid;
            }
        }
        return nums[low];
    }
}