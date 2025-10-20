// Last updated: 10/20/2025, 11:37:56 AM
class Solution {
    public int numberOfMatches(int n) {
        int total = 0;
        while (n > 1) {
            total += n / 2;
            n = n - n / 2;
        }
        return total;
    }
}