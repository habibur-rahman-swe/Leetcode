// Last updated: 10/20/2025, 11:38:16 AM
class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a, b) -> a[0] - b[0]);

        int ans = 0;
        for (int i = 1; i < points.length; i++) {
            ans = Math.max(points[i][0] - points[i-1][0], ans);
        }
        return ans;
    }
}