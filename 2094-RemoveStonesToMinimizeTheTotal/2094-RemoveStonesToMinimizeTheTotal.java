// Last updated: 10/20/2025, 11:36:56 AM
class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));
		int sum = 0;
        for (int x : piles) {
            pq.add(x);
        }
        while (k-- > 0) {
            int x = pq.poll();
            pq.add((x + 1) / 2);
        }
        while (!pq.isEmpty()) {
            sum += pq.poll();
        }
        return sum;
    }
}