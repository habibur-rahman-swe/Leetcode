// Last updated: 10/20/2025, 11:42:01 AM
class Solution {
    private int[][] adj;
	private int cnt = 0;
	private int n;
	private int ans = 0;
    public int largestIsland(int[][] grid) {
        adj = grid;
        n = adj.length;
        int z = 0;
        int p = 2;
		HashMap<Integer, Integer> hm = new HashMap<>();
		hm.put(0, 0);
		
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (adj[i][j] == 1) {
					cnt = 0;
					dfs(i, j, p);
					hm.put(p, cnt);
					p++;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (adj[i][j] == 0) {
                    z++;
					int sum = 0;
					HashSet<Integer> hs = new HashSet<>();
					
					if (i - 1 >= 0) hs.add(adj[i-1][j]);
					if (i + 1 < n) hs.add(adj[i+1][j]);
					if (j - 1 >= 0) hs.add(adj[i][j-1]);
					if (j + 1 < n) hs.add(adj[i][j+1]);
					for (int x : hs) sum += hm.get(x);
					ans = Math.max(ans, sum);
				}
			}
		}
        return z == 0 ? n * n : ans+1;
    }
    
    private void dfs(int i, int j, int p) {
		if (i < 0 || i >= n || j < 0 || j >= n) return;
		if (adj[i][j] != 1) return;
		adj[i][j] = p;
		++cnt;
		dfs(i+1, j, p);
		dfs(i-1, j, p);
		dfs(i, j+1, p);
		dfs(i, j-1, p);
	}
}