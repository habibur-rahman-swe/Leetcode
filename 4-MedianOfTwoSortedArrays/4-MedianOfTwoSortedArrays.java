// Last updated: 10/20/2025, 11:49:14 AM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int[] new_array = new int[len];
        for (int i = 0; i < nums1.length; i++) {
            new_array[i] = nums1[i];
        }
        int l = nums1.length;
        for (int i = 0; i < nums2.length; i++) {
            new_array[l+i] = nums2[i];
        }
        Arrays.sort(new_array);
        double res;
        if (len % 2 == 0) {
            return (double)(new_array[len / 2] + new_array[len / 2 - 1]) / 2;
        }
        else return (double)new_array[len / 2]; 
    }
}