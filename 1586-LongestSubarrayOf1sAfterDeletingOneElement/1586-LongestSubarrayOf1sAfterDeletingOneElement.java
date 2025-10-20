// Last updated: 10/20/2025, 11:38:49 AM
class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0, right = 0, cnt = 0, max = 0;
        while (right < nums.length) {
            if (nums[right] == 0) {
                cnt += 1;
            }

            while (cnt > 1) {
                if (nums[left] == 0) {
                    cnt -= 1;
                }
                left++;
            }
            max = Math.max(max, right - left);
            right++;
        }
        return max;
    }
}