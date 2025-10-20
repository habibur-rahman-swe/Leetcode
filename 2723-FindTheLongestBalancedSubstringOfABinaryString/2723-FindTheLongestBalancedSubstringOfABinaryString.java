// Last updated: 10/20/2025, 11:33:53 AM
class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int one = 0, zero = 0, ans = 0;

        if (s.charAt(0) == '0') ++zero;
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '0' && s.charAt(i-1) == '1') {
                zero = 1;
                one = 0;
            } else if (s.charAt(i) == '1') {
                ++one;
                ans = Math.max(ans, 2 * Math.min(zero, one));
            } else {
                ++zero;
            }
        }

        return ans;
    }
}