// Last updated: 10/20/2025, 11:41:49 AM
class Solution {
    public boolean reorderedPowerOf2(int n) {
        for (long i = 1; i <= (long)Integer.MAX_VALUE; i *= 2) {
            if (digitsSame(i, n)) return true;
        }
        return false;
    }
    public boolean digitsSame(long x, int n) {
        int[] a = new int[10];
        int[] b = new int[10];
        
        while (x > 0) {
            a[(int)(x%10)]++;
            x /= 10;
        }
        
        while (n > 0) {
            b[n%10]++;
            n /= 10;
        }
        
        for (int i = 0; i < 10; i++) {
            if (a[i] == b[i]) continue;
            else return false;
        }
        return true;
    }
}