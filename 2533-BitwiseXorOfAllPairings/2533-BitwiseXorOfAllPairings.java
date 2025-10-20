// Last updated: 10/20/2025, 11:35:09 AM
class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        int ans = 0;
        if (len1 % 2 == 1) {
            for (int x : nums2) ans ^= x;
        }
        if (len2 % 2 == 1) {
            for (int x : nums1) ans ^= x;
        }
        return ans;
    }
}