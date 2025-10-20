// Last updated: 10/20/2025, 11:32:42 AM
class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
		int ans[] = new int[] {-1, -1};
		for (int i = 0, minIdx = 0, maxIdx = 0; i < nums.length - indexDifference; i++) {
			if (nums[i] < nums[minIdx]) {
				minIdx = i;
			}
			if (nums[i] > nums[maxIdx]) {
				maxIdx = i;
			}
			if (Math.abs(nums[minIdx] - nums[i + indexDifference]) >= valueDifference) {
				ans[0] = minIdx;
				ans[1] = i + indexDifference;
				return ans;
			}
			if (Math.abs(nums[maxIdx] - nums[i + indexDifference]) >= valueDifference) {
				ans[0] = maxIdx;
				ans[1] = i + indexDifference;
				return ans;
			}
		}
		return ans;
	}
}