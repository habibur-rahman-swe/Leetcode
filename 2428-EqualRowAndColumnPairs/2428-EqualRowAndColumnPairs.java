// Last updated: 10/20/2025, 11:35:32 AM
class Solution {
    public int equalPairs(int[][] grid) {
        int cnt = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                boolean flag = true;
                for (int k = 0; k < grid.length; k++) {
                    if (grid[i][k] != grid[k][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) ++cnt;
            }
        }
        return cnt;
    }
}