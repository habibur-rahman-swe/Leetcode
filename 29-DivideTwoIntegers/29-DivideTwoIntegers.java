// Last updated: 10/20/2025, 11:48:37 AM
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == 1 << 31 && divisor == -1) return Integer.MAX_VALUE;
        
        boolean sign = (dividend >= 0) == (divisor >= 0) ? true : false;
        
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int res = 0;
        while (dividend - divisor >= 0) {
            int cnt = 0;
            while (dividend - (divisor << 1 << cnt) >= 0) ++cnt;
            res += 1 << cnt;
            dividend -= divisor << cnt;
        }
        return sign ? res : -res;
    }
}