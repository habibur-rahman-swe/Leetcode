// Last updated: 10/20/2025, 11:39:57 AM
class Solution {

    private int max = 0;
    private int[][] grid;

    public int getMaximumGold(int[][] grid) {
        
        this.grid = grid;
        
        int m = grid.length, n = grid[0].length;
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (visited[i][j]) continue;

                dfs(i, j, 0, visited);          
            }
        }

        return max;
    }

    private void dfs(int i, int j, int sum, boolean[][] visited) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0 || visited[i][j]) {
            max = Math.max(max, sum);
            return;
        }

        visited[i][j] = true;
        sum += grid[i][j];
        
        dfs(i + 1, j, sum, visited);
        dfs(i - 1, j, sum, visited);
        dfs(i, j + 1, sum, visited);
        dfs(i, j - 1, sum, visited);

        visited[i][j] = false;
    }
}