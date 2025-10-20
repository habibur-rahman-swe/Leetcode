// Last updated: 10/20/2025, 11:34:33 AM
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        
        int f = 0, s = 0;
        
        if (nums1[nums1.length - 1] < nums2[0] || nums2[nums2.length - 1] < nums1[0]) return -1;

        while (f < nums1.length && s < nums2.length) {
            if (nums1[f] == nums2[s]) return nums1[f];
            else if (nums1[f] < nums2[s]) f++;
            else s++;
        }
        return -1;
    }
}