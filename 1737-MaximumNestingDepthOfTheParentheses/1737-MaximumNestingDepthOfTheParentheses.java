// Last updated: 10/20/2025, 11:38:19 AM
class Solution {
    public int maxDepth(String s) {
        int max = 0, cnt = 0;
        for (char c : s.toCharArray()) {
            cnt += (c == '(' ? 1 : (c == ')' ? -1 : 0));
            max = Math.max(cnt, max);
        }
        return max;
    }
}