// Last updated: 10/20/2025, 11:32:37 AM
class Solution {
    public int minimumSum(int[] nums) {
        int min = 200;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] < nums[j] && nums[j] > nums[k]) {
                        min = Math.min(nums[i] + nums[j] + nums[k], min);
                    }
                }
            }
        }
        return min == 200 ? -1 : min;
    }
}