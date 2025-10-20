// Last updated: 10/20/2025, 11:45:03 AM
class Solution {
    public int missingNumber(int[] nums) {
        int[] a = new int[nums.length + 1];
        int i;
        for (int x : nums) a[x]++;
        for (i = 0; i <= nums.length; i++) {
            if (a[i] == 0) break;
        }
        return i;
    }
}