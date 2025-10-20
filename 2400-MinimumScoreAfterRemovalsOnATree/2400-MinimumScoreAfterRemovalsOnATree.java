// Last updated: 10/20/2025, 11:35:39 AM
class Solution {
    int minScore = Integer.MAX_VALUE;

    public int minimumScore(int[] nodeValues, int[][] edges) {
        int n = nodeValues.length;

        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjacencyList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adjacencyList.get(edge[0]).add(edge[1]);
            adjacencyList.get(edge[1]).add(edge[0]);
        }

        int totalXor = 0;
        for (int val : nodeValues) {
            totalXor ^= val;
        }

        dfsRoot(0, -1, nodeValues, adjacencyList, totalXor);

        return minScore;
    }

    private int calculateScore(int xor1, int xor2, int xor3) {
        return Math.max(xor1, Math.max(xor2, xor3)) - Math.min(xor1, Math.min(xor2, xor3));
    }

    private int dfsRoot(int node, int parent, int[] nodeValues, List<List<Integer>> graph, int totalXor) {
        int subtreeXor = nodeValues[node];

        for (int neighbor : graph.get(node)) {
            if (neighbor == parent) continue;
            subtreeXor ^= dfsRoot(neighbor, node, nodeValues, graph, totalXor);
        }

        for (int neighbor : graph.get(node)) {
            if (neighbor == parent) {
                dfsSecondCut(neighbor, node, subtreeXor, node, nodeValues, graph, totalXor);
            }
        }
        return subtreeXor;
    }

    private int dfsSecondCut(int node, int parent, int xorFirstPart, int firstCutAncestor, int[] nodeValues, List<List<Integer>> graph, int totalXor) {
        int subtreeXor = nodeValues[node];

        for (int neighbor : graph.get(node)) {
            if (neighbor == parent) continue;
            subtreeXor ^= dfsSecondCut(neighbor, node, xorFirstPart, firstCutAncestor, nodeValues, graph, totalXor);
        }

        if (parent != firstCutAncestor) {
            int xorSecondPart = subtreeXor;
            int xorThirdPart = totalXor ^ xorFirstPart ^ xorSecondPart;
            int currentScore = calculateScore(xorFirstPart, xorSecondPart, xorThirdPart);
            minScore = Math.min(minScore, currentScore);
        }
        return subtreeXor;
    }
}