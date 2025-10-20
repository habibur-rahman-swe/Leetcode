// Last updated: 10/20/2025, 11:35:47 AM
class Solution {
    public int minMaxGame(int[] nums) {
        int n = nums.length;
        while (n > 1) {
            n = n / 2;
            
            for (int i = 0; i < n; i++) {
                if (i%2==0) {
                    nums[i] = Math.min(nums[2*i], nums[2*i+1]);
                } else {
                    nums[i] = Math.max(nums[2*i], nums[2*i+1]);
                }
            }
        }
        return nums[0];
    }
}