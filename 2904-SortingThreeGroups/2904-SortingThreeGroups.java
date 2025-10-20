// Last updated: 10/20/2025, 11:33:08 AM
class Solution {
    public int minimumOperations(List<Integer> nums) {
        int n = nums.size();
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        int m = 1;

        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums.get(j) <= nums.get(i)) {
                    dp[i] = Math.max(dp[i], 1 + dp[j]);
                    m = Math.max(m, dp[i]);
                }
            }
        }
        return n - m;
    }
}