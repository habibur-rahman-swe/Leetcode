// Last updated: 10/20/2025, 11:34:51 AM
class Solution {
    public int longestSquareStreak(int[] nums) {
        int[] arr = new int[100001];
        int ans = 1;
        for (int x : nums) {
            arr[x] = 1;
        }

        for (int i = 4; i <= 100000; i++) {
            int sqrt = (int)Math.sqrt(i);
            if (sqrt * sqrt == i && arr[i] > 0) {
                arr[i] += arr[sqrt];
                ans = Math.max(ans, arr[i]);
            }
        }

        return ans > 1 ? ans : -1;
    }
}