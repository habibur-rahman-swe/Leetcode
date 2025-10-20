// Last updated: 10/20/2025, 11:43:51 AM
class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        int[][] pc = new int[n][2];

        for (int i = 0; i < n; i++) {
            pc[i][0] = profits[i];
            pc[i][1] = capital[i];
        }

        Arrays.sort(pc, (a, b) -> (a[1] - b[1]));

        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> (b - a));

        int idx = 0;

        for (int i = 0; i < k; i++) {
            while (idx < n && pc[idx][1] <= w) {
                queue.add(pc[idx][0]);
                ++idx;
            }

            if (!queue.isEmpty()) w += queue.poll();
            else break;
        }

        return w;
    }
}