// Last updated: 10/20/2025, 11:47:36 AM
class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Identify rows and columns to zero using Streams
        Set<Integer> zeroRows = new HashSet<>();
        Set<Integer> zeroCols = new HashSet<>();

        IntStream.range(0, rows).forEach(r ->
            IntStream.range(0, cols)
                .filter(c -> matrix[r][c] == 0)
                .forEach(c -> {
                    zeroRows.add(r);
                    zeroCols.add(c);
                })
        );

        // Zero out the matrix based on identified rows and columns
        IntStream.range(0, rows).forEach(r ->
            IntStream.range(0, cols)
                .filter(c -> zeroRows.contains(r) || zeroCols.contains(c))
                .forEach(c -> matrix[r][c] = 0)
        );
    }
}