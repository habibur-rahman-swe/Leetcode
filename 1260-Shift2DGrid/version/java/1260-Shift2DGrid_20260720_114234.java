// Last updated: 7/20/2026, 11:42:34 AM
1class Solution {
2    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
3        int m = grid.length;
4        int n = grid[0].length;
5
6        int total = m * n;
7
8        k %= total;
9
10        List<List<Integer>> ans = new ArrayList<>();
11
12        for (int i = 0; i < m; i++) {
13            List<Integer> row = new ArrayList<>();
14            for (int j = 0; j < n; j++) {
15                row.add(0);
16            }
17            ans.add(row);
18        }
19
20        for (int i = 0; i < m; i++) {
21            for (int j = 0; j < n; j++) {
22                int oldIndex = i * n + j;
23                int newIndex = (oldIndex + k) % total;
24
25                int newRow = newIndex / n;
26                int newCol = newIndex % n;
27
28                ans.get(newRow).set(newCol, grid[i][j]);
29            }
30        }
31
32        return ans;
33    }
34}