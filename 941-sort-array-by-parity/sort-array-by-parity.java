class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int p[]=new int[n];
        int index=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                p[index++]=nums[i];
            }
        }for(int i=0;i<n;i++){
            if(nums[i]%2!=0){
                p[index++]=nums[i];
            }
        }
        return p;
    }
}