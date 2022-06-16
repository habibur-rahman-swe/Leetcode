class Solution {
    public String longestPalindrome(String s) {
        int left, right;
        
        int n = s.length();
        
        String res = "";
        
        for (int i = 0; i < n; i++) {
            left = i;
            right = i;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            if (right - left - 1 > res.length()) {
                res = s.substring(left + 1, right);
            }
            left = i;
            right = i + 1;
            if (right < n && s.charAt(right) != s.charAt(left)) continue;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            if (right - left - 1 > res.length()) {
                res = s.substring(left+1, right);
            }
        }
        
        return res;
    }
}