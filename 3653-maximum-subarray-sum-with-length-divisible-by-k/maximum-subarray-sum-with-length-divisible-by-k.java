class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;

        // ✅ your prefix array
        long p[] = new long[n];
        p[0] = nums[0];

        for (int i = 1; i < n; i++) {
            p[i] = p[i - 1] + nums[i];
        }

        long max = Long.MIN_VALUE;

        // ✅ your hashmap (mod -> minimum prefix sum)
        HashMap<Integer, Long> ss = new HashMap<>();

        // base case (important)
        ss.put(0, 0L);

        for (int i = 0; i < n; i++) {

            int mod = (i + 1) % k;

            if (ss.containsKey(mod)) {
                // use your prefix array
                max = Math.max(max, p[i] - ss.get(mod));
            }

            // store minimum prefix sum
            ss.put(mod, Math.min(ss.getOrDefault(mod, Long.MAX_VALUE), p[i]));
        }

        return max;
    }
}