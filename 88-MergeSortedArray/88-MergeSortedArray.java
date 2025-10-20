// Last updated: 10/20/2025, 11:47:17 AM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < n + m; i++) {
            nums1[i] = nums2[i-m];
        }
        Arrays.sort(nums1);
    }
}