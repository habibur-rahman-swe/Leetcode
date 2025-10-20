// Last updated: 10/20/2025, 11:44:37 AM
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();
        int n1 = nums1.length, n2 = nums2.length;
        
        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) j++;
            else i++;
        }
        
        int arr[] = new int[list.size()];
        for (i = 0; i < list.size(); i++) arr[i] = list.get(i);
        return arr;
    }
}