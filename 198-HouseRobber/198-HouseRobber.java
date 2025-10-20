// Last updated: 10/20/2025, 11:45:43 AM
class Solution {
    public int rob(int[] nums) {
       
        for (int i = 1; i < nums.length; i++) {
            nums[i] = Math.max(nums[i-1], nums[i] + (i - 1 > 0 ? nums[i-2] : 0));
        }

        return nums[nums.length - 1];
    }
}