// Last updated: 10/20/2025, 11:41:04 AM
class Solution {
    public int fib(int n) {
        if (n == 1 || n == 0) return n;
        return fib(n-1) + fib(n-2);
    }
}