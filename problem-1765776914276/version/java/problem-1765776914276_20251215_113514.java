// Last updated: 12/15/2025, 11:35:14 AM
1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        for (int i = 0; i < nums.length; i++) {
4            for (int j = Math.min(nums.length, i + k + 1) - 1; j > i; j--) {
5                if (nums[i] == nums[j]) return true;
6            }
7        }
8        return false;
9    }
10}