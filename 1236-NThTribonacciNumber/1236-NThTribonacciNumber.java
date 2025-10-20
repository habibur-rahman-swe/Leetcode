// Last updated: 10/20/2025, 11:40:22 AM
class Solution {
    public int tribonacci(int n) {
        int[] tb = new int[Math.max(3, n+2)];
        tb[0] = 0;
        tb[1] = tb[2] = 1;

        for (int i = 3; i <= n; i++) {
            tb[i] = tb[i-1] + tb[i-2] + tb[i-3];
        }
        return tb[n];
    }
}