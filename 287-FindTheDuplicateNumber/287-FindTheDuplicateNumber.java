// Last updated: 10/20/2025, 11:44:57 AM
class Solution {
    public int findDuplicate(int[] nums) {
        int[] arr = new int[nums.length + 1];
        for (int num : nums) {
            arr[num - 1]++;
            if (arr[num - 1] > 1) return num;
        }
        return -1;
    }
}