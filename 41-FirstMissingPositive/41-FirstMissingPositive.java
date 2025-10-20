// Last updated: 10/20/2025, 11:48:20 AM
class Solution {
    public int firstMissingPositive(int[] nums) {
        int idx = 0;
        while (idx < nums.length) {
            int cur = nums[idx] - 1;

            if (nums[idx] > 0 && nums[idx] <= nums.length && nums[cur] != nums[idx]) {
                int temp = nums[idx];
                nums[idx] = nums[cur];
                nums[cur] = temp;
            } else {
                ++idx;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) return i + 1;
        }

        return nums.length + 1;
    }
}