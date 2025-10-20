// Last updated: 10/20/2025, 11:43:45 AM
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid % 2 == 0) {
                if (mid > 0 && nums[mid] == nums[mid-1]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (mid > 0 && nums[mid] == nums[mid-1]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        
        return nums[right];
    }
}