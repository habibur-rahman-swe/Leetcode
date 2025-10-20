// Last updated: 10/20/2025, 11:42:34 AM
class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] dp = new int[10005];
        for (int x : nums) dp[x]++;
        
        for (int i = 2; i <= 10000; i++) {
            dp[i] = Math.max(dp[i] * i + dp[i-2], dp[i-1]);
        }
        
        return dp[10000];
    }
}