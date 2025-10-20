// Last updated: 10/20/2025, 11:39:32 AM
class Solution {
    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) return -1;

        Map<Integer, List<Integer>> adj = new HashMap<>();
        for (int[] connection : connections) {
            adj.computeIfAbsent(connection[0], val -> new ArrayList<>()).add(connection[1]);
            adj.computeIfAbsent(connection[1], val -> new ArrayList<>()).add(connection[0]);
        }

        boolean visited[] = new boolean[n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                ++cnt;
                dfs(i, visited, adj);
            }
        }
        return cnt - 1;
    }

    private void dfs(int x, boolean[] visited, Map<Integer, List<Integer>> adj) {
        if (visited[x]) return;
        visited[x] = true;
        if (adj.get(x) == null) return;

        for (int y : adj.get(x)) {
            dfs(y, visited, adj);
        }
    }
}