// Last updated: 10/20/2025, 11:47:34 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length * matrix[0].length;
        int arr[] = new int[n];
        
        int idx = 0;
        for (int[] a : matrix) {
            for (int x : a) {
                arr[idx] = x;
                idx++;
            }
        }
        
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) return true;
            else if (arr[mid] < target) l = mid + 1;
            else r = mid-1;
        }
        return false;
    }
}