class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] result = new long[k];
        long[] dp = new long[k];

        for (int num : nums) {
            int r = num % k;
            long[] nextDp = new long[k];

            // 1. Start a new subarray at the current index
            nextDp[r]++;

            // 2. Extend existing subarrays
            for (int rem = 0; rem < k; rem++) {
                if (dp[rem] > 0) {
                    int nextRem = (rem * r) % k;
                    nextDp[nextRem] += dp[rem];
                }
            }

            // 3. Accumulate to result array
            for (int rem = 0; rem < k; rem++) {
                result[rem] += nextDp[rem];
            }

            dp = nextDp;
        }

        return result;
    }
}