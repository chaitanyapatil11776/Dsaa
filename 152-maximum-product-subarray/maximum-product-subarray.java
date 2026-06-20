class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int prod = 1;

        for (int i = 0; i < nums.length; i++) {
            prod *= nums[i];
            max = Math.max(max, prod);
            if (prod == 0) prod = 1;
        }

        prod = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            prod *= nums[i];
            max = Math.max(max, prod);
            if (prod == 0) prod = 1;
        }

        return max;
    }
}