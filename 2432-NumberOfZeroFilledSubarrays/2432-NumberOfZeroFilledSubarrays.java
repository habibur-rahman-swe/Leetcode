// Last updated: 10/20/2025, 11:35:31 AM
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        long cnt = 0;

        for (int x : nums) {
            if (x == 0) ++cnt;
            else cnt = 0;
            ans += cnt;
        }
        
        return ans;
    }
}