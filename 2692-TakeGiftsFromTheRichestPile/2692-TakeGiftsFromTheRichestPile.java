// Last updated: 10/20/2025, 11:34:08 AM
class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> (b - a));
        for (int x : gifts) {
            queue.add(x);
        }

        while (k-- > 0 && queue.size() > 0) {
            int x = queue.poll();
            x = (int)Math.sqrt(x);
            if (x > 0) {
                queue.add(x);
            }
        }

        long sum = 0;
        for (int x : queue) {
            sum += x;
        }
        return sum;
    }
}