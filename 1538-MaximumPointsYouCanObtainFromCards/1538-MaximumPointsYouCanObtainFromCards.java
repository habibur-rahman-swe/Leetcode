// Last updated: 10/20/2025, 11:39:06 AM
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int[] sum = new int[n+1];
        for (int i = 0; i < n; i++) {
            sum[i+1] = sum[i] + cardPoints[i];
        }
        int ans = 0;
        for (int i = 0; i <= k; i++) {
            ans = Math.max(ans, sum[k-i] + sum[n] - sum[n-i]);
        }
        return ans;
    }
}