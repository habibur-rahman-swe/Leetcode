// Last updated: 10/20/2025, 11:32:14 AM
class Solution {
    public int removeAlmostEqualCharacters(String word) {
        int cnt = 0;
        for (int i = 1; i < word.length(); i++) {
            if (Math.abs(word.charAt(i) - word.charAt(i-1)) <= 1) {
                ++cnt;
                ++i;
            }
        }
        return cnt;
    }
}