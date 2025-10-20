// Last updated: 10/20/2025, 11:45:15 AM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int zero = 0;
        int mul = 1;
        for (int x : nums) {
            if (x == 0) {
                ++zero;
                continue;
            }
            mul *= x;
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0 && zero == 1) {
                nums[i] = mul;
            } else if (zero == 0) {
                nums[i] = mul / nums[i];
            } else {
                nums[i] = 0;
            }
        }
        return nums;
    }
}