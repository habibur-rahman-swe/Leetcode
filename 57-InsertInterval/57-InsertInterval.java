// Last updated: 10/20/2025, 11:47:58 AM
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[0] - b[0]));

        for (int[] interval : intervals) {
            pq.add(interval);
        }
        pq.add(newInterval);
        
        int start = -1, end = -1;
        while (!pq.isEmpty()) {
            int[] interval = pq.poll();
            if (start <= interval[0] && interval[0] <= end) {
                end = Math.max(end, interval[1]);
            } else {
                list.add(new int[] {start, end});
                start = interval[0];
                end = interval[1];
            }
        }
        list.add(new int[] {start, end});
        int[][] merge = new int[list.size()-1][2];
        for (int i = 1; i < list.size(); i++) {
            merge[i-1] = list.get(i);
        }
        return merge;
    }
}