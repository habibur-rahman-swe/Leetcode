// Last updated: 10/20/2025, 11:34:07 AM
class Solution {
    public long findScore(int[] nums) {
        int n = nums.length;
        boolean[] flag = new boolean[n];
        int[][] dp = new int[n][2];
        for (int i = 0; i < n; i++) {
            dp[i][0] = nums[i];
            dp[i][1] = i;
        }

        Arrays.sort(dp, (a, b) -> (a[0] - b[0]));
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int currIdx = dp[i][1];
            if (flag[currIdx]) continue;
            sum += nums[currIdx];
            flag[currIdx] = true;
            if (currIdx - 1 >= 0) flag[currIdx - 1] = true;
            if (currIdx + 1 < n) flag[currIdx + 1] = true;
        }

        return sum;
    }
}