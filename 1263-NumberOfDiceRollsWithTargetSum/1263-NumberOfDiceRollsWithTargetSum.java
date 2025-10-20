// Last updated: 10/20/2025, 11:40:13 AM
class Solution {
    final int mod = (int) 1e9 + 7;

    public int numRollsToTarget(int n, int k, int target) {
        int[][] dp = new int[n + 1][target + 1];
        for (int[] d : dp) {
            Arrays.fill(d, -1);
        }

        return numRollsToTarget(dp, n, k, target);
    }

    private int numRollsToTarget(int[][] dp, int n, int k, int target) {
        if (n == 0 && target == 0)
            return 1;
        if (n == 0 || target <= 0)
            return 0;

        if (dp[n][target] != -1)
            return (dp[n][target] % mod);

        int numRolls = 0;

        for (int i = 1; i <= k; i++) {
            numRolls = (numRolls + numRollsToTarget(dp, n - 1, k, target - i)) % mod;
        }
        dp[n][target] = numRolls % mod;
        return dp[n][target];
    }
}