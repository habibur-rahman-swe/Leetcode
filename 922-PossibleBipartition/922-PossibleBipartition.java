// Last updated: 10/20/2025, 11:41:37 AM
class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
    	for (int[] edge : dislikes) {
    		int a = edge[0], b = edge[1];
    		adj.computeIfAbsent(a, val -> new ArrayList<Integer>()).add(b);
    		adj.computeIfAbsent(b, val -> new ArrayList<Integer>()).add(a);
    	}
    	
    	int color[] = new int[n + 1];
    	Arrays.fill(color, -1);
    	
    	for (int i = 1; i <= n; i++) {
    		if (color[i] == -1) {
    			if (!bfs(i, adj, color)) return false;
    		}
    	}
    	return true;
    }

    private boolean bfs(int source, Map<Integer, List<Integer>> adj, int[] color) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(source);
        color[source] = 0;

        while (!q.isEmpty()) {
            int node = q.poll();
            if (!adj.containsKey(node)) continue;

            for (int neighbor : adj.get(node)) {
                if (color[neighbor] == color[node]) {
                    return false;
                }

                if (color[neighbor] == -1) {
                    color[neighbor] = 1 - color[node];
                    q.add(neighbor);
                }
            }
        }
        return true;
    }
}