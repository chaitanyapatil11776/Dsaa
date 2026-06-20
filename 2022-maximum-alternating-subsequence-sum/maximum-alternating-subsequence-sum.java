class Solution {
    public long maxAlternatingSum(int[] nums) {
        long even = 0;
        long odd = 0;

        for (int num : nums) {
            long newEven = Math.max(even, odd + num);
            long newOdd = Math.max(odd, even - num);

            even = newEven;
            odd = newOdd;
        }

        return even;
    }
}