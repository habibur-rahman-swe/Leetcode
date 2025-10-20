// Last updated: 10/20/2025, 11:33:19 AM
class Solution {
    public long matrixSumQueries(int n, int[][] queries) {
        long ans = 0;
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();

        for (int j = queries.length - 1; j >= 0; j--) {
            if (queries[j][0] == 0 && !row.contains(queries[j][1])) {
                ans += queries[j][2] * (n - col.size());
                row.add(queries[j][1]);
            } else if (queries[j][0] == 1 && !col.contains(queries[j][1])) {
                ans += queries[j][2] * (n - row.size());
                col.add(queries[j][1]);
            }
        }
        return ans;
    }
}