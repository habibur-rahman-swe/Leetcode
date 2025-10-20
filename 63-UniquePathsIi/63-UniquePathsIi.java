// Last updated: 10/20/2025, 11:47:49 AM
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length + 1][obstacleGrid[0].length + 1];
        
        if (obstacleGrid[0][0] == 1 || obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1] == 1) return 0;

        for (int i = 1; i <= obstacleGrid.length; i++) {
            for (int j = 1; j <= obstacleGrid[0].length; j++) {
                if (i == 1 && j == 1) dp[i][j] = 1;
                else if (obstacleGrid[i-1][j-1] == 1) continue;
                else dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[obstacleGrid.length][obstacleGrid[0].length];
    }
}