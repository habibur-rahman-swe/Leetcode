class Solution {
    public boolean isPossible(int[] a) {
        int sum = 0;
			
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y)->y - x);
        for (int x : a) {
            pq.add(x);
            sum += x;
        }

        while (pq.peek() > 1) {
            int x = pq.poll();

            sum -= x;
            x -= sum;
            while (x > 0 && sum > 0 && x > sum) x -= sum;
            if (sum <= 0 || x <= 0) return false;
            sum += x;
            pq.add(x);
        }
        for (int x : pq) if (x != 1) return false;
        return true;
    }
}