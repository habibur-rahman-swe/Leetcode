// Last updated: 10/20/2025, 11:44:04 AM
class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int idx = 0;
        int i = 0;
        while (i < n) {
            char c = chars[i];
            int j = i;
            while (j < n && chars[i] == chars[j]) {
                ++j;
            }
            int cnt = j - i;
            String s = String.valueOf(cnt);
            
            chars[idx] = c;
            idx++;
            j = 0;
            while (j < s.length() && cnt > 1) {
                chars[idx] = s.charAt(j);
                j++;
                idx++;
            }
            i += cnt;
        }
        return idx;
    }
}