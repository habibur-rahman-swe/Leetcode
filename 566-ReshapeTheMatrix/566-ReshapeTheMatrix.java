// Last updated: 10/20/2025, 11:43:38 AM
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int size = mat.length * mat[0].length;
        if (size != r * c) return mat;
        
        int[] arr = new int[size];
        int idx = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                arr[idx] = mat[i][j];
                idx++;
            }
        }
        
        int[][] res = new int[r][c];
        idx = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = arr[idx];
                idx++;
            }
        }
        return res;
    }
}