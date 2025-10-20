// Last updated: 10/20/2025, 11:32:30 AM
class Solution {
    public int findChampion(int n, int[][] edges) {
        HashMap<Integer, List<Integer>> adj = new HashMap<>();
        for (int i  = 0; i < n; i++) {
            adj.put(i, new ArrayList<Integer>());
        }
        for (int[] edge  : edges) {
            adj.get(edge[0]).add(edge[1]);
        }
        
        for(int i = 0;  i < n; i++) {
            if(bfs(i, adj, n)) return i;
        }
        
        return -1;
    }
    
    private boolean bfs(int x, HashMap<Integer, List<Integer>>  adj, int n) {
        int[] level = new int[n];
        level[x] = 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        while(!queue.isEmpty()) {
            int pres = queue.poll();
            for (int next : adj.get(pres)) {
                if (level[next] == 0) {
                    level[next] = level[pres] + 1;
                    queue.add(next);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (level[i] ==  0) return false;
        }
        return true;
    }
}