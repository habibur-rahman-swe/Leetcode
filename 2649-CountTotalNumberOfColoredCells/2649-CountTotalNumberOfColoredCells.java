// Last updated: 10/20/2025, 11:34:24 AM
class Solution {
    public long coloredCells(int n) {
        long result = (long) n * n + (long)(n-1) * (n-1);
        return result;
    }
}