class Solution {
    public int maximumUniqueSubarray(int[] arr) {
        int n = arr.length;
        int[] idx = new int[100005];
		Arrays.fill(idx, -1);
		int[] sum = new int[n];
		sum[0] = arr[0];
		for (int i = 1; i < n; i++) sum[i] = sum[i-1] + arr[i];
		int ans = 0;
		int mxIdx = -1;
		for (int i = 0; i < n; i++) {
			if (mxIdx == -1 && idx[arr[i]] == -1) {
                ans = Math.max(ans, sum[i]);
                idx[arr[i]] = i;
            } else {
                mxIdx = Math.max(idx[arr[i]], mxIdx);
                ans = Math.max(ans, sum[i] - sum[mxIdx]);
                idx[arr[i]] = i;
            }
		}
        return ans;
    }
}