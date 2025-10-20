// Last updated: 10/20/2025, 11:41:30 AM
class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        boolean[][] visited = new boolean[n][n];

        Queue<Integer> q = new LinkedList<>();
        visited[n-1][0] = true;
        q.add(1);
        int steps = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int x = q.poll();
                if (x == n * n) return steps;

                for (int k = 1; k <= 6; k++) {
                    if (k + x > n * n) break;
                    int[] pos = findCordinates(k + x, n);
                    int r = pos[0];
                    int c = pos[1];

                    if (visited[r][c] == true) continue;
                    visited[r][c] = true;
                    if (board[r][c] == -1) {
                        q.add(k+x);
                    } else {
                        q.add(board[r][c]);
                    }
                }
            }
            ++steps;
        }
        return -1;
    }

    private int[] findCordinates(int cur, int n) {
        int r = n - (cur - 1) / n - 1;
        int c = (cur - 1) % n;
        if (r % 2 == n % 2) {
            return new int[] {r, n-1-c};
        } else {
            return new int[] {r, c};
        }
    }
}