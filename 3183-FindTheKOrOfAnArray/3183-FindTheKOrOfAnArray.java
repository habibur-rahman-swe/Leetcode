// Last updated: 10/20/2025, 11:32:34 AM
class Solution {
    public int findKOr(int[] nums, int k) {
        int[] arr = new int[32];
        for (int x : nums) {
            int temp = x;
            for (int i = 0; i <= 31 && temp > 0; i++, temp /= 2) {
                arr[i] += temp % 2;
            }
        }
        int ans = 0;
        for (int i = 0; i <= 31; i++) {
            if (arr[i] >= k) {
                ans += (int)Math.pow(2, i);
            }
        }
        return ans;
    }
}