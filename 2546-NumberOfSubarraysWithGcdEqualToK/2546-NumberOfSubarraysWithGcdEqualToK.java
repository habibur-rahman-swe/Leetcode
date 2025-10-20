// Last updated: 10/20/2025, 11:35:03 AM
class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentGcd = nums[i];
            for (int j = i; j < nums.length; j++) {
                currentGcd = gcd(currentGcd, nums[j]);
                if (currentGcd == k) ++cnt;
            }
        }
        return cnt;
    }
    
    public int gcd(int a, int b) {
        return (a % b == 0 ? b : gcd(b, a % b));
    }
}