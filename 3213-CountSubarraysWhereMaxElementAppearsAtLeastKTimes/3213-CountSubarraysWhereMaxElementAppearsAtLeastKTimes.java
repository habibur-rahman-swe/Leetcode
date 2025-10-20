// Last updated: 10/20/2025, 11:32:20 AM
class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        int max_cnt = 0;
        long ans = 0;

        int s = 0;
        for (int e = 0; e < nums.length; e++) {
            if (nums[e] == max) {
                ++max_cnt;
            }
            
            while (max_cnt >= k) {
                if (nums[s] == max) {
                    max_cnt--;
                }
                s++;
            }
            ans += s;
        }
        return ans;
    }
}