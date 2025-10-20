// Last updated: 10/20/2025, 11:48:57 AM
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int x = nums[i] + nums[j] + nums[k];
                    if (Math.abs(x - target) < min) {
                        min = Math.abs(x - target);
                        if (min == 0) return x;
                        ans = x;
                    }
                }
            }
        }
        return ans;
    }
}