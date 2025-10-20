// Last updated: 10/20/2025, 11:34:21 AM
class Solution {
    public int countWays(int[][] ranges) {
        Arrays.sort(ranges, (a, b) -> (a[0] - b[0]));
        int mod = 1000000007;
        long[] dp = new long[ranges.length];
        
        dp[0] = 2;
        for (int i = 1; i < ranges.length; i++) {
            if (ranges[i][0] >= ranges[i-1][0] && ranges[i][0] <= ranges[i-1][1]) {
                dp[i] = dp[i-1];
                ranges[i][1] = Math.max(ranges[i-1][1], ranges[i][1]);
            } else {
                dp[i] = 2 * dp[i-1];
            }
            dp[i] %= mod;
        }
        return (int)dp[ranges.length-1];
    }
}