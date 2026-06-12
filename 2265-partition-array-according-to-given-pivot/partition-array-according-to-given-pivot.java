class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        int[] p = new int[nums.length];
        int index = 0;

        // Elements less than pivot
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                p[index++] = nums[i];
            }
        }

        // Elements equal to pivot
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pivot) {
                p[index++] = nums[i];
            }
        }

        // Elements greater than pivot
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > pivot) {
                p[index++] = nums[i];
            }
        }

        return p;
    }
}