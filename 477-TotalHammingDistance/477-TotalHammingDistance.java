// Last updated: 10/20/2025, 11:43:55 AM
class Solution {
    public int totalHammingDistance(int[] nums) {
        int[] arr = new int[33];
        
        for (int x : nums) {
            int i = 0;
            while (x > 0) {
                arr[i] += x % 2;
                x /= 2;
                i++;
            }
        }
        
        int ans = 0, n = nums.length;
        for (int x : arr) {
            ans += x * (n - x);
        }
        
        return ans;
    }
}