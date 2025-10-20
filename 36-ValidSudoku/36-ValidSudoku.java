// Last updated: 10/20/2025, 11:48:27 AM
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
			HashSet<Character> rows = new HashSet<Character>();
			HashSet<Character> cols = new HashSet<Character>();
			HashSet<Character> cube = new HashSet<Character>();
			
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.' && !rows.add(board[i][j])) return false;
				if (board[j][i] != '.' && !cols.add(board[j][i])) return false;
				int rowIdx = 3 * (i / 3);
				int colIdx = 3 * (j % 3);
				
				int RowIndex = 3*(i/3);
            int ColIndex = 3*(i%3);
            if(board[RowIndex + j/3][ColIndex + j%3]!='.' && !cube.add(board[RowIndex + j/3][ColIndex + j%3]))
                return false;
			}

		}
		
		return true;
    }
}