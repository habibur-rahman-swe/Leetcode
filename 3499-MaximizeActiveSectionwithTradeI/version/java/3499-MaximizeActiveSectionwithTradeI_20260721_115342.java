// Last updated: 7/21/2026, 11:53:42 AM
1class Solution {
2    public int maxActiveSectionsAfterTrade(String s) {
3        int n = s.length();
4        int cnt1 = 0;
5        for (char c : s.toCharArray()) {
6            cnt1 += c == '0' ? 0 : 1;
7        }
8
9        int i = 0;
10        int prev = Integer.MIN_VALUE;
11        int curr = 0;
12        int bestGain = 0;
13
14        while (i < n) {
15            int start = i;
16            while (i < n && s.charAt(i) == s.charAt(start)) {
17                ++i;
18            }
19            if (s.charAt(start) == '0') {
20                curr = i - start;
21
22                if (prev != Integer.MIN_VALUE) {
23                    bestGain = Math.max(bestGain, curr + prev);
24                }
25                prev = curr;
26            }
27        }
28        return cnt1 + bestGain;
29    }
30}