// Last updated: 10/20/2025, 11:41:15 AM
class Solution {
    public int minDeletionSize(String[] strs) {
        char[] prev = new char[strs[0].length()];
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[0].length(); j++) {
                if (i == 0) {
                    prev[j] = strs[i].charAt(j);
                } else {
                    if (prev[j] <= strs[i].charAt(j)) {
                        prev[j] = strs[i].charAt(j);
                    } else {
                        prev[j] = 'z' + 1;
                    }
                }
            }
        }
        int cnt = 0;
        for (char c : prev) if (c == 'z' + 1) ++cnt;
        return cnt;
    }
}