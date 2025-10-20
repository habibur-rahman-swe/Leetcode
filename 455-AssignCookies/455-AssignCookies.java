// Last updated: 10/20/2025, 11:43:59 AM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int cnt = 0;
        int idx = 0;

        while (idx < s.length && cnt < g.length) {
            if (s[idx] >= g[cnt]) {
                ++cnt;
            }
            ++idx;
        }
        return cnt;
    }
}