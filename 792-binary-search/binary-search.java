class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        // int ans=-1;

        int hight=nums.length-1;
        while(low<=hight){
            int mid=low+(hight-low)/2;
            if(nums[mid]==target){
                // ans=mid;
                // hight=mid-1;
                return mid;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                hight=mid-1;
            }
        }
        return -1;
    }
}