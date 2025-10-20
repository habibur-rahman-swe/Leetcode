// Last updated: 10/20/2025, 11:42:33 AM
class Solution {
    
    private int[][] dist;
    private List<List<Integer>> adj;
    
    public int networkDelayTime(int[][] times, int n, int k) {
        
        dist = new int[n][n];
        adj = new ArrayList<>();
        k -= 1;
        
        int[] res = new int[n];
        Arrays.fill(res, -1);
        
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        
        for (int[] time : times) {
            int u = time[0] - 1;
            int v = time[1] - 1;
            int d = time[2];
            
            adj.get(u).add(v);
            dist[u][v] = d;
        }
        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(k);
        res[k] = 0;
        
        while (!queue.isEmpty()) {
            int u = queue.poll();
            
            for (int v : adj.get(u)) {
                if (res[v] == -1) {
                    res[v] = dist[u][v] + res[u];
                    queue.add(v);
                } else if (res[v] != -1 && res[u] + dist[u][v] < res[v]) {
                    res[v] = res[u] + dist[u][v];
                    queue.add(v);
                }
            }
        }
        
        int ans = -1;
        for (int x : res) {
            if (x == -1) return -1;
            ans = Math.max(x, ans);
        }
        return ans;
    }
}