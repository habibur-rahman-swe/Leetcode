// Last updated: 10/20/2025, 11:39:46 AM
class Solution {
    private boolean visited[][];
    public int closedIsland(int[][] grid) {
        visited = new boolean[grid.length][grid[0].length];

        int cnt = 0;

        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid[0].length - 1; j++) {
                if (grid[i][j] == 0 && visited[i][j] != true) {
                    boolean isIsland  = dfs(i, j, grid);
                    if (isIsland) ++cnt;
                }
            }
        }

        return cnt;
    }

    private boolean dfs(int i, int j, int[][] grid) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 1 || visited[i][j] == true) return true;

        visited[i][j] = true;

        if (grid[i][j] == 0) {
            if (i == 0 || j == 0 || i == grid.length - 1 || j == grid[0].length - 1) return false;
        }

        boolean flag = true;

        flag &= dfs(i + 1, j, grid);
        flag &= dfs(i - 1, j, grid);
        flag &= dfs(i, j + 1, grid);
        flag &= dfs(i, j - 1, grid);

        return flag;
    }
}