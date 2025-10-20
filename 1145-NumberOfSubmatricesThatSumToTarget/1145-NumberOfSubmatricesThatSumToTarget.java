// Last updated: 10/20/2025, 11:40:33 AM
class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int ans = 0;
        int row = matrix.length, col = matrix[0].length;
        
        int[] rowSum = new int[col];
        
        for (int r = 0; r < row; r++) {
            Arrays.fill(rowSum, 0);
            
            for (int tr = r; tr < row; tr++) {
                for (int c = 0; c < col; c++) {
                    rowSum[c] += matrix[tr][c];
                }
                ans += targetSubArray(rowSum, target);
            }
        }
        return ans;
    }
    
    private int targetSubArray(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 0;
        int sum = 0;
        
        hm.put(0, 1);
        
        for (int x : nums) {
            sum += x;
            if (hm.containsKey(sum - target)) {
                ans += hm.get(sum - target);
            }
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}