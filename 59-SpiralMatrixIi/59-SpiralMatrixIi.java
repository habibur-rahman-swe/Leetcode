// Last updated: 10/20/2025, 11:47:55 AM
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int x = 1;

        boolean right = true, down = false, left = false, up = false;

        int r = 0, c = 0;
        int prev = 1;
        matrix[r][c] = 1;

        while (x <= n * n + 2 * n) {
            if (right) {
                if (c + 1 == n || c + 1 < n && matrix[r][c+1] != 0) {
                    right = false;
                    down = true;
                } else {
                    matrix[r][c + 1] = prev + 1;
                    c++;
                    prev++;
                }
            } else if (down) {
                if (r + 1 == n || r + 1 < n && matrix[r+1][c] != 0) {
                    down = false;
                    left = true;
                } else {
                    matrix[r+1][c] = prev + 1;
                    ++prev;
                    ++r;
                }
            } else if (left) {
                if (c - 1 < 0 || c - 1 >= 0 && matrix[r][c-1] != 0) {
                    left = false;
                    up = true;
                } else {
                    matrix[r][c-1] = prev + 1;
                    ++prev;
                    c--;
                }
            } else if (up) {
                if (r - 1 < 0 || r - 1 >= 0 && matrix[r-1][c] != 0) {
                    up = false;
                    right = true;
                } else {
                    matrix[r-1][c] = prev + 1;
                    ++prev;
                    r--;
                }
            }
            ++x;
        }

        return matrix;
    }
}