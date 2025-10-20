// Last updated: 10/20/2025, 11:40:17 AM
class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        
        Queue<Integer> queue = new PriorityQueue<>();
        int[][] res = new int[r][c];
        
        for (int i = 0; i < r; i++) {
            int j = i, k = 0;
            while (j < r && k < c) {
                queue.add(mat[j][k]);
                j++;
                k++;
            }
            j = i;
            k = 0;
            while (j < r && k < c) {
                res[j][k] = queue.poll();
                j++;
                k++;
            }
        }
        
         for (int i = 0; i < c; i++) {
            int j = 0, k = i;
            while (j < r && k < c) {
                queue.add(mat[j][k]);
                j++;
                k++;
            }
            j = 0;
            k = i;
            while (j < r && k < c) {
                res[j][k] = queue.poll();
                j++;
                k++;
            }
        }
        
        return res;
    }
}