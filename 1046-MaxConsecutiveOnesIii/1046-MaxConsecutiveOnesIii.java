// Last updated: 10/20/2025, 11:40:47 AM
class Solution {
    public int longestOnes(int[] nums, int k) {
        int cnt = 0;
        int ans = 0;

        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] == 0) ++cnt;
            while (cnt > k) {
                if (nums[j] == 0) {
                    cnt--;
                }
                j++;
            }
            ans = Math.max(ans, i - j + 1);
        }
        return ans;
    }
}