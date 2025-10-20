// Last updated: 10/20/2025, 11:37:52 AM
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int[] count = new int[10001];
        int ans = 0, sum = 0;
        int left = 0, right = 0;

        while (right < nums.length) {
            sum += nums[right];
            count[nums[right]]++;
            while (count[nums[right]] > 1) {
                sum -= nums[left];
                count[nums[left++]]--;
            }
            ans = Math.max(ans, sum);
            right++; 
        }
        return ans;
    }
}