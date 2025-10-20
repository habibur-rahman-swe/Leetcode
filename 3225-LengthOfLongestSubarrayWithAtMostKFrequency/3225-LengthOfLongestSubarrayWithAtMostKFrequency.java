// Last updated: 10/20/2025, 11:32:18 AM
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        int l = 0, r = 0;
        while (r < nums.length) {
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
            while (r < nums.length && map.get(nums[r]) > k) {
                map.put(nums[l], map.get(nums[l]) - 1);
                l++;
            }
            ans = Math.max(ans, r - l + 1);
            r++;
        }
        return ans;
    }
}