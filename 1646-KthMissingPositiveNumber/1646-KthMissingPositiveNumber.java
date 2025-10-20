// Last updated: 10/20/2025, 11:38:34 AM
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int x = k;
        for (int y : arr) {
            if (y <= x) ++x;
        }
        return x;
    }
}