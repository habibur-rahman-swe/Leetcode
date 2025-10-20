// Last updated: 10/20/2025, 11:33:46 AM
class Solution {
    public int matrixSum(int[][] nums) {
        int row = nums.length, col = nums[0].length;
        
        for (int i = 0; i < row; i++) {
            Arrays.sort(nums[i]);
        }
        
        for (int r = row - 2; r >= 0; r--) {
            for (int c = 0; c < col; c++) {
                nums[r][c] = Math.max(nums[r][c], nums[r + 1][c]);
            }
        }
        
        for (int i = 1; i < col; i++) {
            nums[0][i] += nums[0][i-1];
        }
        
        return nums[0][col-1];
    }
}