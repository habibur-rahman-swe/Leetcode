// Last updated: 10/20/2025, 11:46:29 AM
class Solution {
    private int[][] board;
	private boolean[][] visited;
	private int r, c;
    public void solve(char[][] s) {
        r = s.length;
        c = s[0].length;
        
        board = new int[r][c];
		visited = new boolean[r][c];
        
        for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (s[i][j] == 'X') board[i][j] = 1;
				else board[i][j] = 0;
			}
		}
        
        for (int i = 1; i < r-1; i++) {
			for (int j = 1; j < c-1; j++) {
				if (board[i][j] == 0 && !visited[i][j] && dfs(i, j)) {
					fill(i, j);
				}
			}
		}
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (board[i][j] == 1) s[i][j] = 'X';
                else s[i][j] = 'O';
            }
        }
    }
    
    private boolean dfs(int i, int j) {
		boolean flag = true;
		visited[i][j] = true;
		
		if ((i == 0 || i == r - 1 || j == 0 || j == c-1) && board[i][j] == 0) return false;
		
		if (i + 1 < r && board[i+1][j] == 0 && !visited[i+1][j]) {
			flag &= dfs(i+1, j);
		}
		if (i - 1 >= 0 && board[i-1][j] == 0 && !visited[i-1][j]) {
			flag &= dfs(i-1, j);
		}
		if (j + 1 < c && board[i][j+1] == 0 && !visited[i][j+1]) {
			flag &= dfs(i, j+1);
		}
		if (j - 1 >= 0 && board[i][j-1] == 0 && !visited[i][j-1]) {
			flag &= dfs(i, j-1);
		}
		
		return flag;
	}
    
    private void fill(int i, int j) {
		if (i == -1 || i == r || j == -1 || j == c) return;
		board[i][j] = 1;
		if (i + 1 < r && board[i+1][j] == 0) {
			fill(i+1, j);
		}
		if (i - 1 >= 0 && board[i-1][j] == 0) {
			fill(i-1, j);
		}
		if (j + 1 < c && board[i][j+1] == 0) {
			fill(i, j+1);
		}
		if (j - 1 >= 0 && board[i][j-1] == 0) {
			fill(i, j-1);
		}
	}
}