// Last updated: 10/20/2025, 11:32:41 AM
class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        int z1 = 0, z2 = 0;
        long sum1 = 0, sum2 = 0;
        
        for (int x : nums1) {
            sum1 += x;
            z1 += x == 0 ? 1 : 0;
        }
        
        for (int x : nums2) {
            sum2 += x;
            z2 += x == 0 ? 1 : 0;
        }
        long ans = 0;
        if (sum1 == sum2 && z1 != 0 && z2 != 0) ans = sum1 + Math.max(z1, z2);
        else if (sum1 == sum2 && z1 == 0 && z2 == 0) ans = sum1;
        else if (z1 != 0 && z2 != 0) ans = Math.max(sum1 + z1, sum2 + z2);
        else if (z1 == 0 && z2 != 0 && sum1 >= sum2 + z2) ans = sum1;
        else if (z2 == 0 && z1 != 0 && sum1 + z1 <= sum2) ans = sum2;
        else ans = -1;
        return ans;
    }
}