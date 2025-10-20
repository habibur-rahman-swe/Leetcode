// Last updated: 10/20/2025, 11:45:06 AM
class Solution {
    public boolean isUgly(int n) {
        while (n > 1 && n % 2 == 0) n /= 2;
        while (n > 1 && n % 3 == 0) n /= 3;
        while (n > 1 && n % 5 == 0) n /= 5;

        return (n == 1);
    }
}