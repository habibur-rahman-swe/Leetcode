// Last updated: 10/20/2025, 11:32:36 AM
class Solution {
    public long minIncrementOperations(int[] nums, int k) {
        int n = nums.length;
        long[] dp = new long[n];
        for (int i = 0; i < n; i++) {
            dp[i] = Math.max(0, k - nums[i]);
        }
        
        for (int i = 3; i < n; i++) {
            dp[i] += Math.min(dp[i-1], Math.min(dp[i-2], dp[i-3]));
        }
        
        return Math.min(dp[n-1], Math.min(dp[n-2], dp[n-3]));
    }
}