// Last updated: 10/20/2025, 11:47:28 AM
class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0) && search(0, word, i, j, board)) return true;
            }
        }
        return false;
    }

    private boolean search(int idx, String word, int i, int j, char[][] board) {
        if (idx == word.length()) return true;

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(idx)) return false;
        char x = board[i][j];
        board[i][j] = ' ';

        boolean found = search(idx + 1, word, i + 1, j, board) ||
                        search(idx + 1, word, i - 1, j, board) ||
                        search(idx + 1, word, i, j + 1, board) ||
                        search(idx + 1, word, i, j - 1, board);

        board[i][j] = x;

        return found;
    }
}