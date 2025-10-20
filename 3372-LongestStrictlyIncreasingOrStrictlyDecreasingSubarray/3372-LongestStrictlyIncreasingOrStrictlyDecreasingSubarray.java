// Last updated: 10/20/2025, 11:31:56 AM
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int res = 1, low = 1, high = 1;
        int prev = nums[0];
        for (int num : nums){
            if (num > prev){
                high++;
                low = 1;
            }
            else if (num < prev){
                low++;
                high = 1;
            }
            else{
                low = 1;
                high = 1;
            }
            res = Math.max(res, Math.max(low, high));
            prev = num;
        }
        return res;
    }
}