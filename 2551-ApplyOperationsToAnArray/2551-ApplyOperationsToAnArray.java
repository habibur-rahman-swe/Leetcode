// Last updated: 10/20/2025, 11:35:02 AM
class Solution {
    public int[] applyOperations(int[] nums) {
        int idx = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            nums[idx] = nums[i];
            if (idx != i) nums[i] = 0;
            if (nums[idx] != 0) ++idx;
        }

        return nums;
    }
}