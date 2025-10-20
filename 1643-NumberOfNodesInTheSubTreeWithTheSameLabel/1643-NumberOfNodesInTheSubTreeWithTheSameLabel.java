// Last updated: 10/20/2025, 11:38:36 AM
class Solution {
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        for (int[] edge : edges) {
            int a = edge[0], b = edge[1];
            adj.computeIfAbsent(a, val -> new ArrayList<Integer>()).add(b);
            adj.computeIfAbsent(b, val -> new ArrayList<Integer>()).add(a);
        }

        int[] res = new int[n];
        dfs(0, -1, adj, res, labels.toCharArray());
        return res;
    }

    public int[] dfs(int node, int parent, Map<Integer, List<Integer>> adj, int[] res, char[] labels) {
        int[] nodeCounts = new int[26];
        nodeCounts[labels[node] - 'a'] = 1;

        if (!adj.containsKey(node)) return nodeCounts;

        for (int child : adj.get(node)) {
            if (child == parent) continue;
            int[] childCounts = dfs(child, node, adj, res, labels);

            for (int i = 0; i < 26; i++) {
                nodeCounts[i] += childCounts[i];
            }
        }
        res[node] = nodeCounts[labels[node] - 'a'];
        return nodeCounts;
    }
}