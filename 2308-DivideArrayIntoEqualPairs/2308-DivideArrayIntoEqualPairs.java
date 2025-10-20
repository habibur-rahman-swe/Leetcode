// Last updated: 10/20/2025, 11:36:05 AM
class Solution {
    public boolean divideArray(int[] nums) {
        int[] arr = new int[501];
        for (int x : nums) arr[x]++;
        for (int x : arr) if (x % 2 == 1) return false;
        return true;
    }
}