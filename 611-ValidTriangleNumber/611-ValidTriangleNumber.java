// Last updated: 10/20/2025, 11:43:15 AM
class Solution {
    public int triangleNumber(int[] num) {
        int n = num.length;
        Arrays.sort(num);
		int ans = 0;
		for(int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				for (int k = j+1; k < n; k++) {
					if (num[i] <= num[k] && num[j] <= num[k] && (num[i] + num[j]) > num[k]) ++ans;
				}
			}
		}
        return ans;
    }
}