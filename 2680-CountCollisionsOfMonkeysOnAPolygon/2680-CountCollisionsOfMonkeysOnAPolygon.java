// Last updated: 10/20/2025, 11:34:12 AM
class Solution {
    public int monkeyMove(int n) {
        long base = 2, result = 1, exp = n, mod = 1000000007;
        while (exp > 0) {
            if ((exp & 1) == 1) result = (result * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }
        result %= mod;
        result -= 2;
        if (result < 0) result += mod;
        return (int)result;
    }
}