// Last updated: 5/19/2026, 4:26:37 PM
1class Solution {
2    public int getCommon(int[] nums1, int[] nums2) {
3        
4        int f = 0, s = 0;
5        
6        if (nums1[nums1.length - 1] < nums2[0] || nums2[nums2.length - 1] < nums1[0]) return -1;
7
8        while (f < nums1.length && s < nums2.length) {
9            if (nums1[f] == nums2[s]) return nums1[f];
10            else if (nums1[f] < nums2[s]) f++;
11            else s++;
12        }
13        return -1;
14    }
15}