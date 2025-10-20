// Last updated: 10/20/2025, 11:35:24 AM
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int[] a = new int[blocks.length() + 1];
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i <= blocks.length(); i++) {
            a[i] = blocks.charAt(i-1) == 'B' ? 1 : 0;
            a[i] += a[i-1];
            if (i >= k) {
                ans = Math.min(ans, k - a[i] + a[i-k]);
            }
        }
        return ans;
    }
}