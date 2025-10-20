// Last updated: 10/20/2025, 11:44:48 AM
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n < 0) return false;
        while (n > 0 && n % 3 == 0) n /= 3;
        return n == 1;
    }
}