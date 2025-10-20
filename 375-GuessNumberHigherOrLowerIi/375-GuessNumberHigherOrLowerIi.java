// Last updated: 10/20/2025, 11:44:26 AM
class Solution {
    private int[][] dp;

    public int getMoneyAmount(int n) {
        dp = new int[n+1][n+1];
        return getMoney(1, n);
    }

    private int getMoney(int l, int r) {
        if (l >= r) return 0;

        if (dp[l][r] > 0) return dp[l][r];

        int ans = Integer.MAX_VALUE;

        for (int i = l; i <= r; i++) {
            ans = Math.min(ans, i + Math.max(getMoney(l, i-1), getMoney(i + 1, r)));
        }
        dp[l][r] = ans;

        return ans;
    }
}