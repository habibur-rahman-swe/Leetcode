// Last updated: 10/20/2025, 11:41:23 AM
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;

        for (int row = n - 2; row >= 0; row--) {
            for (int col = n - 1; col >= 0; col--) {
                int case1 = col - 1 < 0 ? Integer.MAX_VALUE : matrix[row+1][col-1];
                int case2 = col + 1 >= n ? Integer.MAX_VALUE : matrix[row+1][col+1];
                int case3 = matrix[row+1][col];

                matrix[row][col] += Math.min(case1, Math.min(case2, case3));
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int col = 0; col < n; col++) {
            ans = Math.min(ans, matrix[0][col]);
        }
        return ans;
    }
}