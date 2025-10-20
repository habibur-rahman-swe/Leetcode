// Last updated: 10/20/2025, 11:32:58 AM
class Solution {
    public int minimumMoves(int[][] grid) {
        int zeros = 0;
        for (int[] row : grid) {
            for (int col : row) {
                if (col == 0) ++zeros;
            }
        }

        if (zeros == 0) return 0;

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] != 0) continue;

                for (int ri = 0; ri < 3; ri++) {
                    for (int cj = 0; cj < 3; cj++) {
                        if (grid[ri][cj] <= 1) continue;

                        int d = Math.abs(ri - i) + Math.abs(cj - j);

                        grid[i][j]++;
                        grid[ri][cj]--;

                        ans = Math.min(ans, d + minimumMoves(grid));

                        grid[i][j]--;
                        grid[ri][cj]++;
                    }
                }
            }
        }
        return ans;
    }
}