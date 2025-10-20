// Last updated: 10/20/2025, 11:34:18 AM
class Solution {
    public int maxScore(int[] nums) {
        Arrays.sort(nums);
        long prefix[] = new long[nums.length];
        for (int i = 0; i < nums.length; i++) {
            prefix[i] = nums[nums.length - i - 1];
        }
        
        for (int i = 1; i < nums.length; i++) {
            prefix[i] += prefix[i-1];
        }
        int cnt = 0;
        for (long x : prefix) {
            if (x > 0) ++cnt;
        }
        return cnt;
    }
}