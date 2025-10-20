// Last updated: 10/20/2025, 11:48:05 AM
class Solution {
    public int ans = 0;
    boolean[] cols, leftDiagonal, rightDiagonal;
    
    public int totalNQueens(int n) {
        cols = new boolean[n];
        leftDiagonal = new boolean[2*n];
        rightDiagonal = new boolean[2*n];
        
        solveNQUtil(0, n);
        
        return ans;
    }
    
    public void solveNQUtil(int row, int n) {
        if (row == n) {
            ++ans;
            return;
        }
        
        for (int col = 0; col < n; col++) {
            if (cols[col] || leftDiagonal[row+col] || rightDiagonal[row-col+n]) {
                continue;
            }
            
            cols[col] = leftDiagonal[row+col] = rightDiagonal[row-col+n] = true;
            solveNQUtil(row+1, n);
            cols[col] = leftDiagonal[row+col] = rightDiagonal[row-col+n] = false;
        }
    }
}