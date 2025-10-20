// Last updated: 10/20/2025, 11:33:32 AM
class Solution {
    public int maxMoves(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        int ans = 0;

        for (int i = 0; i < grid.length; i++) {
            dp[i][0] = 1;
        }

        for (int col = 0; col < grid[0].length; col++) {
            for (int row = 0; row < grid.length; row++) {
                if (dp[row][col] == 0) continue;

                if (row - 1 >= 0 && col + 1 < grid[0].length && grid[row - 1][col + 1] > grid[row][col]) dp[row - 1][col + 1] = Math.max(dp[row][col] + 1, dp[row - 1][col + 1]);
                if (col + 1 < grid[0].length && grid[row][col] < grid[row][col + 1]) dp[row][col + 1] = Math.max(dp[row][col] + 1, dp[row][col + 1]);
                if (row + 1 < grid.length && col + 1 < grid[0].length && grid[row][col] < grid[row + 1][col + 1]) dp[row + 1][col + 1] = Math.max(dp[row][col] + 1, dp[row + 1][col + 1]);

                ans = Math.max(dp[row][col], ans);
            }
        }

        return ans - 1;
    }
}