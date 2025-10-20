// Last updated: 10/20/2025, 11:38:00 AM
class Solution {
    public int minimumDeviation(int[] nums) {
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num % 2 == 1) {
                num = 2 * num;
            }
            minVal = Math.min(minVal, num);
            pq.offer(num);
        }

        int deviation = Integer.MAX_VALUE;

        while (true) {
            maxVal = pq.poll();
            deviation = Math.min(deviation, maxVal - minVal);
            if (maxVal % 2 == 1) break;
            maxVal /= 2;
            minVal = Math.min(minVal, maxVal);
            pq.offer(maxVal);
        }

        return deviation;
    }
}