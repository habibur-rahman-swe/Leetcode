// Last updated: 10/20/2025, 11:38:54 AM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        for (int i = 0, j = 0, k = n; i < 2 * n; i += 2, j++, k++) {
            arr[i] = nums[j];
            arr[i+1] = nums[k];
        }
        return arr;
    }
}