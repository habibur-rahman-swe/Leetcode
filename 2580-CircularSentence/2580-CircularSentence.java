// Last updated: 10/20/2025, 11:34:56 AM
class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] s = sentence.split(" ");
        for (int i = 0; i < s.length; i++) {
            if (s[i].charAt(s[i].length() - 1) == s[(i+1)%s.length].charAt(0)) continue;
            else return false;
        }
        return true;
    }
}