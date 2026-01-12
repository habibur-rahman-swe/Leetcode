// Last updated: 1/12/2026, 2:45:43 PM
1class Solution {
2    public int minTimeToVisitAllPoints(int[][] points) {
3        int ans = 0;
4        for (int i = 0; i < points.length - 1; i++) {
5            int currX = points[i][0];
6            int currY = points[i][1];
7
8            int targetX = points[i + 1][0];
9            int targetY = points[i + 1][1];
10            ans += Math.max(Math.abs(targetX - currX), Math.abs(targetY - currY));
11        }
12        return ans;
13    }
14}