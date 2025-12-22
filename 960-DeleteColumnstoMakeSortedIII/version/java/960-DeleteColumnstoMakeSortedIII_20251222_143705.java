// Last updated: 12/22/2025, 2:37:05 PM
1class Solution {
2    public int minDeletionSize(String[] strs) {
3        int n = strs[0].length();
4        int[] dp = new int[n];
5        Arrays.fill(dp, 1);
6
7        for (int i = 0; i < n; i++) {
8            for (int j = 0; j < i; j++) {
9                boolean valid = true;
10
11                for (String s : strs) {
12                    if (s.charAt(j) > s.charAt(i)) {
13                        valid = false;
14                        break;
15                    }
16                }
17
18                if (valid) {
19                    dp[i] = Math.max(dp[i], dp[j] + 1);
20                }
21            }
22        }
23        int longest = 1;
24        for (int len : dp) {
25            longest = Math.max(longest, len);
26        }
27        return n - longest;
28    }
29}