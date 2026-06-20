class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
         int ans = 0;

        for (int i = 0; i <= nums.length - firstLen; i++) {
            int sum1 = 0;

            for (int j = i; j < i + firstLen; j++) {
                sum1 += nums[j];
            }

            for (int k = 0; k <= nums.length - secondLen; k++) {

                // check overlap
                if (k + secondLen <= i || k >= i + firstLen) {

                    int sum2 = 0;
                    for (int l = k; l < k + secondLen; l++) {
                        sum2 += nums[l];
                    }

                    ans = Math.max(ans, sum1 + sum2);
                }
    }
}
return ans;
    }
}