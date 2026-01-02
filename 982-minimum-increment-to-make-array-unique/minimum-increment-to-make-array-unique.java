class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int move=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                int need=nums[i-1]+1;
                move+=need-nums[i];
                nums[i]=need;
            }
        }
        return move;
    }
}