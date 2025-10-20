// Last updated: 10/20/2025, 11:43:41 AM
class Solution {
    private int n;
    private int[][] adj;
    private boolean[] visited;
    public int findCircleNum(int[][] isConnected) {
        int cnt = 0;
        this.n = isConnected.length;
        this.adj = isConnected;

        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;
            dfs(i);
            ++cnt;
        }

        return cnt;
    }

    private void dfs(int x) {
        if (visited[x]) return;
        visited[x] = true;

        for (int i = 0; i < n; i++) {
            if (adj[x][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }
}