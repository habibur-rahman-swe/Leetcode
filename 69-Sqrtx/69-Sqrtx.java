// Last updated: 10/20/2025, 11:47:41 AM
class Solution {
    public int mySqrt(int x) {
        long l = 1, r = x;
        
        while (l <= r) {
            long mid = l + (r - l) / 2;
            if (mid * mid == x) return (int)mid;
            else if (mid * mid < x) l = mid + 1;
            else r = mid - 1;
        }
        return (int) r;
    }
}