// Last updated: 10/20/2025, 11:36:43 AM
class Solution {
    public int maximumDifference(int[] nums) {
        int min = nums[0];
        int ans = 0;
        for (int num : nums) {
            ans = Math.max(ans, num - min);
            min = Math.min(num, min);
        }
        return ans == 0 ? -1 : ans;
    }
}