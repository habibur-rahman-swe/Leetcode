// Last updated: 10/20/2025, 11:40:18 AM
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        // length of text 1
        int text1Length = text1.length();
        // length of text 2
        int text2Length = text2.length();

        // create a 2D array and store the LCS length
        int[][] dp = new int[text1Length + 1][text2Length + 1];

        // filling the 2D array using DP programming
        for (int i = 1; i <= text1Length; i++) {
            for (int j = 1; j <= text2Length; j++) {
                // if charter of ith position of text1 will equal with the charat at jth position of text2 then then dp[i][j] will increase diagonaly else will the maximum of the neigbors
                dp[i][j] = text1.charAt(i-1) == text2.charAt(j-1) ? (dp[i-1][j-1] + 1) : Math.max(dp[i][j-1], dp[i-1][j]);
            }
        }
        // return the maximum value of dp
        return dp[text1Length][text2Length];
    }
}