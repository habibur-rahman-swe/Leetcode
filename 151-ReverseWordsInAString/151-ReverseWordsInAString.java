// Last updated: 10/20/2025, 11:46:10 AM
class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        reverse(s.trim().split(" +"), 0, sb);
        return new String(sb);
    }

    private void reverse(String[] s, int i, StringBuilder sb) {
        if (i == s.length) return;
        reverse(s, i + 1, sb);
        sb.append(s[i]);
        if (i != 0) sb.append(" ");
    }
}