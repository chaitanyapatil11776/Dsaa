class Solution {
    void ss(int nums[],int left,int right){
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        ss(nums,0,n-1);
        ss(nums,0,k-1);
        ss(nums,k,n-1);
    }
}