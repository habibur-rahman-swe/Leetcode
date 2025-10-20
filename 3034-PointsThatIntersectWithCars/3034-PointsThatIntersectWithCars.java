// Last updated: 10/20/2025, 11:33:01 AM
class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (List<Integer> x : nums) {
            pq.add(new int[] {x.get(0), x.get(1)});
        }
        
        int ans = 0;
        
        while (pq.size() > 1) {
            int[] x = pq.poll();
            int[] y = pq.poll();
            
            if (x[1] >= y[0]) {
                int[] z = new int[]{Math.min(x[0], y[0]), Math.max(x[1], y[1])};
                pq.offer(z);
            } else {
                ans += x[1] - x[0] + 1;
                pq.offer(y);
            }
        }
        
        ans += pq.peek()[1] - pq.peek()[0] + 1;
        
        return ans;
    }
}