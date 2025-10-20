// Last updated: 10/20/2025, 11:35:16 AM
class Solution {
    public int minGroups(int[][] intervals) {
        int rangeStart = Integer.MAX_VALUE;
        int rangeEnd = Integer.MIN_VALUE;
        for (int[] interval : intervals) {
            rangeStart = Math.min(rangeStart, interval[0]);
            rangeEnd = Math.max(rangeEnd, interval[1]);
        }

        int[] pointToCount = new int[rangeEnd + 2];
        for (int[] interval : intervals) {
            pointToCount[interval[0]]++;
            pointToCount[interval[1] + 1]--;
        }

        int councurrentIntervals = 0;
        int maxConcurrentIntervals = 0;

        for (int i = rangeStart; i <= rangeEnd; i++) {
            councurrentIntervals += pointToCount[i];
            maxConcurrentIntervals = Math.max(maxConcurrentIntervals, councurrentIntervals);
        }
        return maxConcurrentIntervals;
    }
}