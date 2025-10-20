// Last updated: 10/20/2025, 11:32:49 AM
class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length-1;
        int[] maxLeft = new int[n+1];
        int[] maxRight = new int[n+1];
        
        maxLeft[0] = nums[0];
        maxRight[n] = nums[n];
        
        for (int i = 1; i <= n; i++) {
            maxLeft[i] = Math.max(maxLeft[i-1], nums[i]);
        }
        
        for (int i = n - 1; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i+1], nums[i]);
        }
        
        long ans = 0;
        for (int i = 1; i < n; i++) {
            ans = Math.max(ans, (long)(maxLeft[i-1] - nums[i]) * maxRight[i+1]);
            // System.out.println("i# " + i + " : " + maxLeft[i-1] + " " + nums[i] + " " + maxRight[i+1]);
        }
        return ans;
    }
}