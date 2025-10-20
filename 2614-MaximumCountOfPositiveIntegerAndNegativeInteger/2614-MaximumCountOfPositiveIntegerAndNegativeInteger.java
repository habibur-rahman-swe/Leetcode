// Last updated: 10/20/2025, 11:34:44 AM
class Solution {
    public int maximumCount(int[] nums) {
        int n = 0, p = 0;
        for (int x : nums) {
            if (x > 0) {
                ++p;
            }
            if (x < 0) {
                ++n;
            }
        }
        return Math.max(p, n);
    }
}