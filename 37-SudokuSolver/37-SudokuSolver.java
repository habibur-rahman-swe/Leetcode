// Last updated: 10/20/2025, 11:48:25 AM
class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    boolean solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.') {
                    for (char num = '1'; num <= '9'; num++) {
                        if (isSafe(board, i, j, num)) {
                            board[i][j] = num;
                            if (solve(board)) {
                                return true;
                            } else {
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    boolean isSafe(char[][] board, int row, int col, char num) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == num) {
                return false;
            }
            if (board[row][i] == num) {
                return false;
            }

            int sqrt = (int)(Math.sqrt(board.length));
            int rowStart = row - row % sqrt;
            int colStart = col - col % sqrt;

            for (int r  = rowStart; r < rowStart + sqrt; r++) {
                for (int c = colStart; c < colStart + sqrt; c++) {
                    if (board[r][c] == num) {
                        return false;
                    }
                }
            }
           
        }
        return true;
    }
}