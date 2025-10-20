// Last updated: 10/20/2025, 11:31:52 AM
class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder("");
        char prev = ' ';
        int cnt = 0;

        for (char c : word.toCharArray()) {
            if (c == prev && cnt < 9) {
                cnt++;
            } else {
                if (prev != ' ') {
                    sb.append(cnt);
                    sb.append(prev);
                }
                prev = c;
                cnt = 1;
            }
        }
        sb.append(cnt).append(prev);
        return new String(sb);
    }
}