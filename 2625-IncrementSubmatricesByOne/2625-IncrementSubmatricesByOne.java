// Last updated: 10/20/2025, 11:34:39 AM
class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] res = new int[n][n];
        int r1, r2, c1, c2;
        for (int[] querie : queries) {
            r1 = querie[0];
            c1 = querie[1];
            r2 = querie[2];
            c2 = querie[3];
            
            for (int r = r1; r <= r2; r++) {
                for (int c = c1; c <= c2; c++) {
                    res[r][c]++;
                }
            }
        }
        return res;
    }
}