// Last updated: 10/20/2025, 11:34:41 AM
class Solution {
    public long maxKelements(int[] nums, int k) {
		long score = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
		for (int x : nums) {
			pq.add(x);
		}
		while (pq.peek() > 1 && k > 0) {
			score += pq.peek();
			long x = pq.poll();
			pq.add((int)((x + 2) / 3));
			k--;
		}
        score += k;
		return score;
	}
}