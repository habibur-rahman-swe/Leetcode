// Last updated: 10/20/2025, 11:32:27 AM
class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int ans  = 0;
        for  (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) <= Math.min(nums[i], nums[j])) {
                    ans = Math.max(ans, nums[i] ^ nums[j]);
                }
            }
        }
        return ans;
    }
}