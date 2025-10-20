// Last updated: 10/20/2025, 11:44:42 AM
class Solution {
    public int integerBreak(int n) {
        int ans = 0;
        for (int i = 2; i <= n; i++) {
            int x = n / i;
            int y = n % i == 0 ? (int)Math.pow(n / i, i) : (int)(Math.pow(n / i, i - n % i) * Math.pow(n / i + 1, n % i));
            ans = Math.max(ans, y);
        }
        return ans;
    }
}