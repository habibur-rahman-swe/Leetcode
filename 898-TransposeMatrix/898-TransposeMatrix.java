// Last updated: 10/20/2025, 11:41:50 AM
class Solution {
    public int[][] transpose(int[][] a) {
		int n = a.length;
        int m = a[0].length;
        int[][] b = new int[m][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[j][i] = a[i][j];
            }
        }
        return b;
	}
}