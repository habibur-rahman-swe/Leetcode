// Last updated: 10/20/2025, 11:48:02 AM
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int c = 0, r = 0;
        int x = -1000;
        boolean right = true, down = false, left = false, up = false;

        List<Integer> list = new ArrayList<>();

        int n = matrix.length * matrix[0].length + 2 * matrix.length + 2 * matrix[0].length;

        list.add(matrix[0][0]);
        matrix[0][0] = x;

        for (int i = 0; i <= n; i++) {
            if (right) {
                if (c + 1 == matrix[0].length || c + 1 < matrix[0].length && matrix[r][c+1] == x) {
                    down = true;
                    right = false;
                } else {
                    list.add(matrix[r][c+1]);
                    matrix[r][c+1] = x;
                    ++c;
                }
            } else if (down) {
                if (r + 1 == matrix.length || r + 1 < matrix.length && matrix[r+1][c] == x) {
                    down = false;
                    left = true;
                } else {
                    list.add(matrix[r+1][c]);
                    matrix[r+1][c] = x;
                    ++r;
                }
            } else if (left) {
                if (c - 1 < 0 || c - 1 >= 0 && matrix[r][c-1] == x) {
                    left = false;
                    up = true;
                } else {
                    list.add(matrix[r][c-1]);
                    matrix[r][c-1] = x;
                    c--;
                }
            } else if (up){
                if (r - 1 < 0 || r - 1 >= 0 && matrix[r-1][c] == x) {
                    up = false;
                    right = true;
                } else {
                    list.add(matrix[r-1][c]);
                    matrix[r-1][c] = x;
                    r--;
                }
            }
        }
        return list;
    }
}