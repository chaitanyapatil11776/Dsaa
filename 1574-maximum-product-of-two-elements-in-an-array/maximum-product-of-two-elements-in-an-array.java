class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
          int diff = (nums[i] - 1) * (nums[i + 1] - 1);
            max=Math.max(max,diff);
        }
        return max;
    }
}