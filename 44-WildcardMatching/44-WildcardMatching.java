// Last updated: 10/20/2025, 11:48:16 AM
class Solution {
    public boolean isMatch(String s, String p) {
        boolean[][] match = new boolean[s.length() + 1][p.length() + 1];
        for (int i = p.length(); i >= 0; i--) {
            if (i == p.length()) match[s.length()][i] = true;
            else if (p.charAt(i) == '*') match[s.length()][i] = true;
            else break;
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = p.length() - 1; j >= 0; j--) {
                if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?') {
                    match[i][j] = match[i+1][j+1];
                } else if (p.charAt(j) == '*') {
                    match[i][j] = match[i+1][j] | match[i][j+1];
                } else {
                    match[i][j] = false;
                }
            }
        }
        return match[0][0];
    }
}