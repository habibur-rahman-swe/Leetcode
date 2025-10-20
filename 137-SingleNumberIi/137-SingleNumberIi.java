// Last updated: 10/20/2025, 11:46:23 AM
class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        Arrays.sort(nums);
        int cnt = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i-1] == nums[i]) ++cnt;
            else {
                if (cnt == 1) return nums[i-1];
                cnt = 1;
            }
        }
        return nums[n-1];
    }
}