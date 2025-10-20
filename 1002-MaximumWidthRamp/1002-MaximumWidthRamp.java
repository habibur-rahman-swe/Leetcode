// Last updated: 10/20/2025, 11:41:07 AM
class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        int[] rightMax = new int[n];

        rightMax[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], nums[i]);
        }

        int left = 0, right = 0;
        int maxWidth = 0;

        for (int i = 0, j = 0; i < n; i++) {
            while (j < i && nums[j] > rightMax[i]) {
                j++;
            }
            maxWidth = Math.max(i - j, maxWidth);
        }
        return maxWidth;
    }
}