// Last updated: 10/20/2025, 11:45:42 AM
class Solution {
    public boolean[][] visited;
    public char[][] grid;
    
    public int numIslands(char[][] grid) {
        this.grid = grid;
        
        int r = grid.length;
        int c = grid[0].length;
        
        visited = new boolean[r][c];
        int cnt = 0;
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (visited[i][j] == true || grid[i][j] == '0') continue;
                dfs(i, j);
                ++cnt;
            }
        }
        
        return cnt;
    }
    
    public void dfs(int i, int j) {
        if (i < 0 || i >= grid.length) return;
        if (j < 0 || j >= grid[0].length) return;
        if (visited[i][j] == true) return;
        if (grid[i][j] == '0') return;
        
        visited[i][j] = true;
        
        dfs(i+1, j);
        dfs(i, j+1);
        dfs(i-1, j);
        dfs(i, j-1);
    }
}