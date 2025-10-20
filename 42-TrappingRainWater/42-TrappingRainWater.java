// Last updated: 10/20/2025, 11:48:19 AM
class Solution {
    public int trap(int[] h) {
        int l = 0, r = h.length - 1, ans = 0;
        int lmax = Integer.MIN_VALUE, rmax = Integer.MIN_VALUE;
        while (l < r) {
            lmax = Math.max(lmax, h[l]);
            rmax = Math.max(rmax, h[r]);
            ans += lmax < rmax ? lmax - h[l++] : rmax - h[r--];
        }
        return ans;
    }
}