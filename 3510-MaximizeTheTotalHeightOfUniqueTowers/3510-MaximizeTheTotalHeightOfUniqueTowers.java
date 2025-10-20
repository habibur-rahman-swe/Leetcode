// Last updated: 10/20/2025, 11:31:48 AM
class Solution {
    public long maximumTotalSum(int[] maximumHeight) {
        long sum = 0;
        Arrays.sort(maximumHeight);
        int n = maximumHeight.length;
        int max = maximumHeight[n-1];
        
        for (int i = n - 1; i >= 0; i--) {
            if (max <= 0) return -1;
            sum += Math.min(max, maximumHeight[i]);
            max = Math.min(max, maximumHeight[i]) - 1;
        }
        
        return sum;
    }
}