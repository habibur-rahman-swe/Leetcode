class Solution {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int M = 1000000007;
        int[][] dp = new int[m][n];
        dp[startRow][startColumn] = 1;
        int count = 0;
        
        for (int moves = 1; moves <= maxMove; moves++) {
            int[][] temp = new int[m][n];
            
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0) {
                        count = (count + dp[i][j]) % M;
                    }
                    if (j == 0) {
                        count = (count + dp[i][j]) % M;
                    }
                    if (i == m-1) {
                        count = (count + dp[i][j]) % M;
                    }
                    if (j == n-1) {
                        count = (count + dp[i][j]) % M;
                    }
                    
                    
                    if (i > 0) {
                        temp[i][j] = (temp[i][j] + dp[i-1][j]) % M;
                    }
                    if (j > 0) {
                        temp[i][j] = (temp[i][j] + dp[i][j-1]) % M;
                    }
                    if (i < m - 1) {
                        temp[i][j] = (temp[i][j] + dp[i+1][j]) % M;
                    } 
                    if (j < n - 1) {
                        temp[i][j] = (temp[i][j] + dp[i][j+1]) % M;
                    }
                }
            }
            
            dp = temp;
        }
        return count;
    }
}