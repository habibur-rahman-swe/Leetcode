// Last updated: 10/20/2025, 11:48:10 AM
class Solution {
    public void rotate(int[][] matrix) {
        int r = matrix.length, c = matrix[0].length;
        int[][] res = new int[r][c];
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = matrix[c - j - 1][i];
            }
        }
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = res[i][j];
            }
        }
    }
}