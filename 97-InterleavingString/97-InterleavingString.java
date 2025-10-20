// Last updated: 10/20/2025, 11:47:05 AM
class Solution {
    public boolean solve(String s1, String s2, String s3, int idx1, int idx2, int[][] dp) {
        if (idx1 + idx2 == s3.length()) return true;
        if (dp[idx1][idx2] != 0) return dp[idx1][idx2] == 1;
        boolean ans = false;

        if (idx1 < s1.length() && s1.charAt(idx1) == s3.charAt(idx1 + idx2)) {
            ans |= solve(s1, s2, s3, idx1 + 1, idx2, dp);
        }

        if (idx2 < s2.length() && s2.charAt(idx2) == s3.charAt(idx1 + idx2)) {
            ans |= solve(s1, s2, s3, idx1, idx2 + 1, dp);
        }

        dp[idx1][idx2] = ans ? 1 : -1;
        return ans;
    }
    public boolean isInterleave(String s1, String s2, String s3) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        return (s1.length() + s2.length()) == s3.length() ? solve(s1, s2, s3, 0, 0, dp) : false;
    }
}