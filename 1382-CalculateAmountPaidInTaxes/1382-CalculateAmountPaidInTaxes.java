// Last updated: 10/20/2025, 11:39:47 AM
class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double ans = 0;
        int n = brackets.length;
        
        for (int i = 0; i < n; i++) {
            int min;
            if (i == 0) min = Math.min(brackets[i][0], income);
            else min = Math.min(brackets[i][0] - brackets[i-1][0], income);
            ans += (double)(min * brackets[i][1]) / 100.00;
            income -= min;
            if (income == 0) break;
        }
        return ans;
    }
}