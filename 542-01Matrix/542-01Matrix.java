// Last updated: 10/20/2025, 11:43:44 AM
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int row = mat.length, col = mat[0].length, INF = row + col;

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (mat[r][c] == 0) continue;
                int top = INF, left = INF;

                if (r - 1 >= 0) top = mat[r-1][c];
                if (c - 1 >= 0) left = mat[r][c - 1];

                mat[r][c] = Math.min(top, left) + 1;
            }
        }

        for (int r = row - 1; r >= 0; r--) {
            for (int c = col - 1; c >= 0; c--) {
                int bottom = INF, right = INF;
                if (r + 1 < row) bottom = mat[r + 1][c];
                if (c + 1 < col) right = mat[r][c + 1];

                mat[r][c] = Math.min(mat[r][c], Math.min(bottom, right) + 1);
            }
        }
        return mat;
    }
}