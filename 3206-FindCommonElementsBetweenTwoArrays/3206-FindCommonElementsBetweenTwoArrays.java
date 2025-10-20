// Last updated: 10/20/2025, 11:32:22 AM
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] a = new int[101];
        int[] b = new int[101];
        
        for (int x : nums1) a[x]++;
        for (int x : nums2) b[x]++;
        
        int cnt1 = 0, cnt2 = 0;
        for (int x : nums1) {
            if (b[x] > 0) ++cnt1;
        }
        
        for (int x : nums2) {
            if (a[x] > 0) ++cnt2;
        }
        
        return new int[] {cnt1, cnt2};
    }
}