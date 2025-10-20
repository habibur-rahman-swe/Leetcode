// Last updated: 10/20/2025, 11:47:51 AM
class Solution {
    public int uniquePaths(int m, int n) {
        return nCr(m + n - 2, m - 1);
    }
    
    public int nCr(int n, int r) {
        long res = 1;
        
        int mul = Math.max(r, n - r) + 1;
        int div = Math.min(r, n - r);
        
        while (mul <= n || div > 1) {
            if (mul <= n) {
                res *= mul;
                mul++;
            }
            if (res % div == 0) {
                res /= div;
                div--;
            }
        }
        
        return (int)res;
    }
}