// Last updated: 10/20/2025, 11:33:36 AM
class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
        int ans = 0, tAns = 0;
        int ppi = -1;
        char prev = '.';
        for (int i = 0; i < s.length(); i++) {
            char pres = s.charAt(i);
            if (pres != prev) {
                ++tAns;
            } else {
                if (ppi == -1) {
                    ppi = i - 1;
                    ++tAns;
                } else {
                    tAns = i - ppi;
                    ppi = i - 1;
                }
            }
            prev = pres;
            ans = Math.max(ans, tAns);
        }
        return ans;
    }
}