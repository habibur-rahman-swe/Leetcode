// Last updated: 10/20/2025, 11:40:05 AM
class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder("");
        int cnt = 0;
        int idx = 0;
        char prev = ' ';
        for (char c : s.toCharArray()) {
            if (prev == c) {
                ++cnt;
            } else {
                cnt = 1;
                prev = c;
            }
            if (cnt < 3) {
                sb.append(c);
            }
            ++idx;
        }
        return new String(sb);
    }
}