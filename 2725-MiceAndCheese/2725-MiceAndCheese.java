// Last updated: 10/20/2025, 11:33:51 AM
class Solution {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int ans = 0, n = reward1.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));

        for (int i = 0; i < n; i++) {
            ans += reward2[i];
            pq.add(reward1[i] - reward2[i]);
        }

        while (k-- > 0) {
            ans += pq.poll();
        }

        return ans;
    }
}