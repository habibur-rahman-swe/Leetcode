// Last updated: 10/20/2025, 11:33:57 AM
class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                leftSum[i] = nums[i];
            } else {
                leftSum[i] = nums[i] + leftSum[i-1];
            }
        }
        
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                rightSum[i] = nums[i];
            } else {
                rightSum[i] = nums[i] + rightSum[i+1];
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return nums;
    }
}