// Last updated: 10/20/2025, 11:46:08 AM
class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0], ans = nums[0], c1, c2;
        for (int i = 1; i < nums.length; i++) {
            c1 = nums[i] * min;
            c2 = nums[i] * max;
            max = Math.max(nums[i], Math.max(c1, c2));
            min = Math.min(nums[i], Math.min(c1, c2));
            ans = Math.max(ans, max);
        }
        return ans;
    }
}