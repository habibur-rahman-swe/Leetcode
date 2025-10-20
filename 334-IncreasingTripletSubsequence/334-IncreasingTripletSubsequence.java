// Last updated: 10/20/2025, 11:44:45 AM
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;

        if (n < 3) return false;

        int left = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (mid < nums[i]) {
                return true;
            } else if (left < nums[i] && nums[i] < mid) {
                mid = nums[i];
            } else if (nums[i] < left) {
                left = nums[i];
            }
        }

        return false;
    }
}