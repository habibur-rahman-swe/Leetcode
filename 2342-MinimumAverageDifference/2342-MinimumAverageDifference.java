// Last updated: 10/20/2025, 11:36:00 AM
class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;

        long[] sum = new long[n+1];

        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i-1] + nums[i-1];
        }

        long min = Integer.MAX_VALUE;
        int idx = 0;

        for (int i = 1; i < n; i++) {
            long diff = Math.abs(sum[i]/i - (sum[n] - sum[i])/(n - i));
            if (min > diff) {
                min = diff;
                idx = i - 1;
            }
        }

        if (sum[n] / n < min) {
            idx = n - 1;
        }
        return idx;
    }
}