// Last updated: 10/20/2025, 11:44:17 AM
class Solution {
    public boolean isSubsequence(String s, String t) {
        int idx = 0;
        for (char c : t.toCharArray()) {
            if (idx < s.length() && s.charAt(idx) == c) ++idx;
        }
        return idx == s.length();
    }
}