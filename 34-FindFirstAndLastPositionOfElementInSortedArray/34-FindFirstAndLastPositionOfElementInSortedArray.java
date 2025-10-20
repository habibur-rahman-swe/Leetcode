// Last updated: 10/20/2025, 11:48:30 AM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = bs(nums, target, true);
        int last = bs(nums, target, false);

        return new int[] {first, last};
    }

    private int bs(int[] nums, int target, boolean first) {
        int low = 0, high = nums.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target < nums[mid]) {
                high = mid - 1;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                ans = mid;
                if (first) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return ans;
    }
}