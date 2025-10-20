// Last updated: 10/20/2025, 11:42:49 AM
class Solution {
    public int gr[][];
	public boolean visited[][];
	public int n, m, cnt;
	
	public int maxAreaOfIsland(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        
        visited = new boolean[n][m];
        gr = grid;
        
        int mx = 0;
        
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < m; j++) {
        		if (gr[i][j] == 0) continue;
        		if (visited[i][j] == true) continue;
        		cnt = 0;
        		area(i, j);
        		mx = Math.max(mx, cnt);
        	}
        }
        return mx;
    }
	
	public void area(int i, int j) {
		if (gr[i][j] == 0 || visited[i][j]) return;
		++cnt;
		visited[i][j] = true;
		if (i - 1 >= 0) area(i-1, j);
		if (i + 1 < n)  area(i+1, j);
		if (j - 1 >= 0) area(i, j-1);
		if (j + 1 < m)  area(i, j+1);
	}
}