// Last updated: 10/20/2025, 11:35:38 AM
class Solution {
    public int countAsterisks(String s) {
        int cnt = 0, b = 0;
        for (char c : s.toCharArray()) {
            if (c == '|') b = (b + 1) % 2;
            if (b == 0 && c == '*') ++cnt;
        }
        return cnt;
    }
}