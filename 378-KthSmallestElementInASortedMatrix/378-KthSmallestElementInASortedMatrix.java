// Last updated: 10/20/2025, 11:44:24 AM
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for (int x[] : matrix) {
            for (int y : x) {
                tm.put(y, tm.getOrDefault(y, 0) + 1);
            }
        }
        
        for (int x: tm.keySet()) {
            k -= tm.get(x);
            if (k <= 0) return x;
        }
        return -1;
    }
}