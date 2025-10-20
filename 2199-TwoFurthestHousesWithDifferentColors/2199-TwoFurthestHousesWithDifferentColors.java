// Last updated: 10/20/2025, 11:36:33 AM
class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int j = n-1;
            while (j > i && colors[i] == colors[j]) {
                j--;
            }
            max = Math.max(max, j - i);
        }
        return max;
    }
}