// Last updated: 10/20/2025, 11:47:27 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 3) return nums.length;
        int i = 0, j;
        int l = nums.length;
        for (j = 1; j < l - 1;j++) {
            if (nums[i] == nums[j + 1]) continue;
            else if (nums[i] != nums[j]) nums[++i] = nums[j];
            else {
                nums[++i] = nums[j];
            }
        }
        nums[++i] = nums[l - 1];
        return i + 1;
    }
}