// Last updated: 10/20/2025, 11:32:54 AM
class Solution {
    private boolean check(String a, String b) {
        if (a.length() != b.length()) return false;
        int x = a.length() - 1, cnt = 0;
        while (x >= 0) {
            if (a.charAt(x) != b.charAt(x)) ++cnt;
            x--;
        }
        return cnt == 1;
    }
    public List<String> getWordsInLongestSubsequence(int n, String[] words, int[] groups) {
        int[] dp = new int[n];
        int[] pv = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(pv, -1);
        int maxIdx = 0;

        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                String a = words[i];
                String b = words[j];
                if (groups[i] != groups[j] && check(a, b)) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        pv[i] = j;
                        if (dp[maxIdx] < dp[i]) {
                            maxIdx = i;
                        }
                    }
                }
            }
        }
        List<String> list = new ArrayList<>();
        while (maxIdx != -1) {
            list.add(words[maxIdx]);
            maxIdx = pv[maxIdx];
        }
        Collections.reverse(list);
        return list;
    }
}