// Last updated: 10/20/2025, 11:33:09 AM
class Solution {
    public int maximumBeauty(int[] nums, int k) {
        int ans = 0;
		
		Arrays.sort(nums);
		
		for (int i = 0, j = 0; i < nums.length; i++ ) {
			if (nums[i] - nums[j] <= 2 * k) {
				ans = Math.max(ans, i - j + 1);
			} else {
				while (nums[i] - nums[j] > 2 * k) {
					j++;
				}
			}
		}
		
		return ans;
    }
}