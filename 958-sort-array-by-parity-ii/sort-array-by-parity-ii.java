class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int p[]=new int[nums.length];
        int even=0;
        int old=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0){
                p[even]=nums[i];
                even+=2;
            }else{
                p[old]=nums[i];
                old+=2;
            }
        }
        return p;
    }
}