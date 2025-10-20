// Last updated: 10/20/2025, 11:39:35 AM
class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            if (num >= 10 && num <= 99 ||
                num >= 1000 && num <= 9999 ||
                num >= 100000 && num <= 999999) ++ans;
        }
        return ans;
    }
}