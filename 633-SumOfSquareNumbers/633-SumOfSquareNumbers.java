// Last updated: 10/20/2025, 11:43:04 AM
class Solution {
    public boolean judgeSquareSum(int c) {
        if (solve(c) == true)return true;
        else return false;
    }
    boolean solve(int c) {
        long a, b, n;
        
        for (long i = 0; i * i <= c; i++) {
            b = (int)Math.sqrt(c - i * i);
            if (i * i + b * b == c) return true;
        }
        return false;
    }
}