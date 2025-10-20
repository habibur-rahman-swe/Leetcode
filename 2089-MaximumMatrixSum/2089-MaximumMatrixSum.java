// Last updated: 10/20/2025, 11:36:59 AM
class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = Arrays.stream(matrix)
            .flatMapToInt(Arrays::stream)
            .mapToLong(Math::abs)
            .sum();

        long min = Arrays.stream(matrix)
            .flatMapToInt(Arrays::stream)
            .mapToLong(Math::abs)
            .min()
            .orElse(0l);
        
        long neg = Arrays.stream(matrix)
            .flatMapToInt(Arrays::stream)
            .filter(val -> val < 0)
            .count();

        return sum - (neg % 2 == 1 ? 2L * min : 0);
    }
}