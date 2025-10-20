// Last updated: 10/20/2025, 11:36:46 AM
class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double, Long> map = new HashMap<>();
        for (int[] rectangle : rectangles) {
            double x = (double) rectangle[0] / rectangle[1];
            map.put(x, map.getOrDefault(x, 0l) + 1);
        }

        long ans = 0;
        for (double x : map.keySet()) {
            ans += map.get(x) * (map.get(x) - 1) / 2;
        }
        return ans;
    }
}