// Last updated: 10/20/2025, 11:44:44 AM
class Solution {
    public boolean isPowerOfFour(int n) {
        while (n % 4 == 0 && n > 0) {
            n /= 4;
        }
        return n == 1;
    }
}