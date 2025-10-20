// Last updated: 10/20/2025, 11:47:14 AM
class Solution {
    public int numDecodings(String s) {
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        int oneDig = 0, twoDig = 0;

        for (int i = 2; i <= s.length(); i++) {
            oneDig = charToInt(s.charAt(i - 1));
            twoDig = charToInt(s.charAt(i - 2)) * 10 + charToInt(s.charAt(i - 1));

            if (oneDig > 0)
                dp[i] = dp[i - 1];
            if (twoDig > 9 && twoDig < 27)
                dp[i] += dp[i - 2];
        }

        return dp[s.length()];
    }

    private int charToInt(char c) {
        return c - '0';
    }
}