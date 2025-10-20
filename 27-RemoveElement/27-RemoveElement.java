// Last updated: 10/20/2025, 11:48:40 AM
class Solution {
    public int removeElement(int[] nums, int val) {
        int r = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==val) {
                ++r;
            }else {
                nums[i-r] = nums[i];
            }
        }
        return nums.length - r;
    }
}