// Last updated: 10/20/2025, 11:42:48 AM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int s = 0, e = 0, prod = 1, ans = 0;
        while (e < nums.length) {
            prod *= nums[e];
            while (s < e && prod >= k) {
                prod /= nums[s];
                s++;
            }
            if (prod < k) {
                ans += e - s + 1;
            }
            e++;
        }
        return ans;
    }
}