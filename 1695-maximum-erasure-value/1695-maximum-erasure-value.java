class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        int[] sum = new int[n+1];
        for (int i = 0; i < n; i++) {
            sum[i+1] = sum[i] + nums[i];
        }
        int ans = 0;
        int idx = 0;
        int[] M = new int[100001];
        Arrays.fill(M, -1);
        for (int i = 0; i < n; i++) {
            idx = Math.max(idx, M[nums[i]] + 1);
            ans = Math.max(ans, sum[i+1] - sum[idx]);
            M[nums[i]] = i;
        }
        return ans;
    }
}