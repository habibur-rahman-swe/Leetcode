// Last updated: 10/20/2025, 11:34:46 AM
class Solution {
    public long minOperations(int[] nums1, int[] nums2, int k) {
        long cnt = 0;
        int n = nums1.length;
        long sum1 = 0, sum2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums1[i] == nums2[i]) continue;
            if (nums1[i] != nums2[i] && k == 0) return -1;
            if (nums1[i] % k != nums2[i] % k) return -1;
            sum1 += nums1[i];
            sum2 += nums2[i];
            cnt += Math.abs(nums1[i] - nums2[i]) / k;
        }
        if (sum1 != sum2) return -1;
        return cnt / 2;
    }
}