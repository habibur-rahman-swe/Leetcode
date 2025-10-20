// Last updated: 10/20/2025, 11:44:58 AM
class Solution {
    public void moveZeroes(int[] nums) {
        int idx = 0, nzIdx = 0;
        while (idx < nums.length) {
            if (nums[idx] != 0) {
                nums[nzIdx++] = nums[idx];
            }
            ++idx;
        }
        while (nzIdx < nums.length) {
            nums[nzIdx] = 0;
            nzIdx++;
        }
    }
}