// Last updated: 10/20/2025, 11:48:03 AM
class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) continue;
            nums[i] = Math.max(nums[i], nums[i]+nums[i-1]);
            max = Math.max(max, nums[i]);
        }
        return max;
    }
}