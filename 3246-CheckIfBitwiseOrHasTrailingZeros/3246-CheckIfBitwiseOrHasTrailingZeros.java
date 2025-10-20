// Last updated: 10/20/2025, 11:32:09 AM
class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int cnt = 0;
        for (int num : nums) {
            cnt += (num + 1) % 2;
        }

        return cnt > 1;
    }
}