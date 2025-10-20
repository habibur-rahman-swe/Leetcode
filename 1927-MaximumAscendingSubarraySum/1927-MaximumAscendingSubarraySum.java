// Last updated: 10/20/2025, 11:37:18 AM
class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = nums[0], maxSum = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i-1]) {
                maxSum = Math.max(maxSum, sum);
                sum = 0;
            }
            sum += nums[i];
        }
        return Math.max(sum, maxSum);
    }
}