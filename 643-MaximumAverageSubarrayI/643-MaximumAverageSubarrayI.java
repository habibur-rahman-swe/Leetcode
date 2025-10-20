// Last updated: 10/20/2025, 11:43:01 AM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double avg = sum / (double)k;
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i-k];
            avg = Math.max(avg, sum / (double)k);
        }
        return avg;
    }
}