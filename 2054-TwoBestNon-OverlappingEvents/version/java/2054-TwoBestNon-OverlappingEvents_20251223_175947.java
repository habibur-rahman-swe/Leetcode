// Last updated: 12/23/2025, 5:59:47 PM
1class Solution {
2    public int maxTwoEvents(int[][] events) {
3        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>(
4            Comparator.comparingInt(Pair::getKey)
5        );
6        Arrays.sort(events, (a, b) -> a[0] - b[0]);
7
8        int maxVal = 0, maxSum = 0;
9        for (int[] event : events) {
10            while (!pq.isEmpty() && pq.peek().getKey() < event[0]) {
11                maxVal = Math.max(maxVal, pq.peek().getValue());
12                pq.poll();
13            }
14            maxSum = Math.max(maxSum, maxVal + event[2]);
15            pq.add(new Pair<>(event[1], event[2]));
16        }
17        return maxSum;
18    }
19}