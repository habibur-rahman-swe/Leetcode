// Last updated: 10/20/2025, 11:41:27 AM
class Solution {
    public int partitionDisjoint(int[] nums) {
        int n = nums.length;
        int[] leftmax = new int[n];
        int[] rightmin = new int[n];
        
        leftmax[0] = nums[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(leftmax[i-1], nums[i]);
        }
        
        rightmin[n-1] = nums[n-1];
        for (int i = n - 2; i >= 0; i--) {
            rightmin[i] = Math.min(rightmin[i+1], nums[i]);
        }
        
        for (int i = 1; i < n; i++) {
            if (rightmin[i] >= leftmax[i-1]) return i;
        }
        throw null;
    }
}