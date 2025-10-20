// Last updated: 10/20/2025, 11:32:45 AM
class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int[] ans = new int[] {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            for (int j = indexDifference + i; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) >= valueDifference) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}