// Last updated: 10/20/2025, 11:47:48 AM
class Solution {
    public int minPathSum(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0) continue;
                else if (j == 0) {
                    grid[i][j] += grid[i-1][j];
                } else if (i == 0) {
                    grid[i][j] += grid[i][j-1];
                } else {
                    grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
                }
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}