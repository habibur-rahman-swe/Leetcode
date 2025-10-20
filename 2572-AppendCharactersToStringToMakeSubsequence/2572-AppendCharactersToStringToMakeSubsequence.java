// Last updated: 10/20/2025, 11:34:58 AM
class Solution {
    public int appendCharacters(String s, String t) {
        int idx = 0;
        for (char c : s.toCharArray()) {
            if (idx < t.length() && c == t.charAt(idx)) {
                idx++;
            }
        }
        return t.length() - idx;
    }
}