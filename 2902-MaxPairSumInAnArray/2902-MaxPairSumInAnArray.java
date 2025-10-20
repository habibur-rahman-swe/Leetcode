// Last updated: 10/20/2025, 11:33:10 AM
class Solution {
    public int maxSum(int[] nums) {
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));
		int ans = -1;
		for (int i = 1; i <= 9; i++) {
			for (int x : nums) {
				int temp = x;
				int maxDigit = 0;
				while (temp > 0) {
					maxDigit = Math.max(maxDigit, temp % 10);
					temp /= 10;
				}
				if (maxDigit == i) {
					pq.add(x);
				}
			}
			if (pq.size() > 1) {
				ans = Math.max(ans, pq.poll() + pq.poll());
			}
            pq.clear();
		}
		return ans;
	}
}