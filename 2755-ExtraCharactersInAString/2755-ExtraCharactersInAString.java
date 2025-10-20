// Last updated: 10/20/2025, 11:33:50 AM
class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        Set<String> dictSet = new HashSet<>(Arrays.asList(dictionary));
        int[] dp = new int[s.length() + 1];
        Arrays.fill(dp, -1);
        dp[s.length()] = 0;
        return dfs(0, s, dictSet, dp);
    }

    private int dfs(int idx, String s, Set<String> dict, int[] dp) {
        if (dp[idx] != -1) return dp[idx];

        int res = 1 + dfs(idx + 1, s, dict, dp);
        
        for (int i = idx; i < s.length(); i++) {
            String curr = s.substring(idx, i + 1);
            if (dict.contains(curr)) {
                res = Math.min(res, dfs(i + 1, s, dict, dp));
            } 
        }
        return dp[idx] = res;
    }
}