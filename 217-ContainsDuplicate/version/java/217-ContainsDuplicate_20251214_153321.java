// Last updated: 12/14/2025, 3:33:21 PM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        Set<Integer> set = new HashSet<>();
4        for (int i = 0; i < nums.length; i++) {
5            if (set.contains(nums[i])) return true;
6            set.add(nums[i]);
7        }
8        return false;
9    }
10}