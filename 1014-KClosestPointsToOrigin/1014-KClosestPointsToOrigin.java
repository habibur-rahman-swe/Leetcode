// Last updated: 10/20/2025, 11:41:03 AM
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((x, y) -> hm.get(y) - hm.get(x));
        
        for (int i = 0; i < points.length; i++) {
            int d = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            hm.put(i, d);
            pq.add(i);
        }
        
        while (pq.size() > k) pq.poll();
        
        int s = pq.size();
        int[][] res = new int[s][2];
        int idx = 0;
        for (int x : pq) {
            res[idx][0] = points[x][0];
            res[idx][1] = points[x][1];
            idx++;
        }
        
        return res;
    }
}