// Last updated: 10/20/2025, 11:35:19 AM
class Solution {
    public String removeStars(String s) {
        int n = s.length();
        boolean[] flag = new boolean[n];
        int star = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '*') {
                ++star;
                flag[i] = true;
            } else {
                if (star > 0) {
                    flag[i] = true;
                    star--;
                }
            }
        }
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            if (!flag[i]) sb.append(s.charAt(i));
        }
        return new String(sb);
    }
}