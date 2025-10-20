// Last updated: 10/20/2025, 11:38:48 AM
class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = nums[0];
        
        for (int i = 1; i < n; i++) {
            res[i] = nums[i] + res[i-1];
        }
        return res;
    }
}