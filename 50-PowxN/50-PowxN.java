// Last updated: 10/20/2025, 11:48:08 AM
class Solution {
    public double myPow(double x, long n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 1.0 / myPow(x, -1 * n);
        }

        if (n % 2 == 1) {
            return x * myPow(x * x, (n - 1) / 2);
        } else {
            return myPow(x * x, n / 2);
        }
    }
}