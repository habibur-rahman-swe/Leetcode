// Last updated: 10/20/2025, 11:47:21 AM
class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[] dp = new int[m + 1];

        int maxArea = 0;

        for (char[] row : matrix) {
            for (int i = 0; i < m; i++) {
                dp[i] = row[i] == '1' ? dp[i] + 1 : 0;
                System.out.print(dp[i] + " ");
            }
            
            for (int i = 0; i < m; i++) {
                for (int j = i, min = Integer.MAX_VALUE; j < m; j++) {
                    min = Math.min(dp[j], min);
                    if (min == 0) break;
                    maxArea = Math.max(maxArea, (j - i + 1) * min);
                }
            }
            System.out.println(maxArea);
        }
        return maxArea;
    }
}