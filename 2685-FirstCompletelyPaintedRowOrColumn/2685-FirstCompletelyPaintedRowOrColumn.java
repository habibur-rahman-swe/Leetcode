// Last updated: 10/20/2025, 11:34:11 AM
class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int[] map = new int[arr.length + 1];
        int n = arr.length;
        int numOfRows = mat.length;
        int numOfCols = mat[0].length;

        for (int i = 0; i < n; i++) {
            map[arr[i]] = i;
        }

        int result = Integer.MAX_VALUE;
        for (int row = 0; row < numOfRows; row++) {
            int lastMaxIndex = Integer.MIN_VALUE;
            for (int col = 0; col < numOfCols; col++) {
                lastMaxIndex = Math.max(lastMaxIndex, map[mat[row][col]]);
            }
            result = Math.min(result, lastMaxIndex);
        }

        for (int col = 0; col < numOfCols; col++) {
            int lastMaxIndex = Integer.MIN_VALUE;
            for (int row = 0; row < numOfRows; row++) {
                lastMaxIndex = Math.max(lastMaxIndex, map[mat[row][col]]);
            }
            result = Math.min(result, lastMaxIndex);
        }

        return result;
    }
}