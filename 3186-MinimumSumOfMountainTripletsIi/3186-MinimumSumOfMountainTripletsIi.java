// Last updated: 10/20/2025, 11:32:33 AM
class Solution {
    public int minimumSum(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                left[i] = nums[i];
            } else {
                left[i] = Math.min(nums[i], left[i-1]);
            }
        }
        
        for (int i = n - 1; i >= 0; i--) {
            right[i] = (i==n-1) ? nums[i] : Math.min(nums[i], right[i+1]);
        }
        
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < n - 1; i++) {
            if (left[i] < nums[i] && right[i] < nums[i]) {
                min = Math.min(min, left[i] + right[i] + nums[i]);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}