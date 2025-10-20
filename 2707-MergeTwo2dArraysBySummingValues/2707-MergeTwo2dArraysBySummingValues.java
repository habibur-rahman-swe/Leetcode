// Last updated: 10/20/2025, 11:34:00 AM
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for (int[] num : nums1) {
            tm.put(num[0], num[1]);
        }
        
        for (int[] num : nums2) {
            tm.put(num[0], tm.getOrDefault(num[0], 0) + num[1]);
        }
        
        int[][] mergedArray = new int[tm.size()][2];
        int idx = 0;
        for (int x : tm.keySet()) {
            mergedArray[idx][0] = x;
            mergedArray[idx][1] = tm.get(x);
            idx++;
        }
        return mergedArray;
    }
}