// Last updated: 10/20/2025, 11:46:37 AM
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;

        for (int i = 0; i < n; i++) {
            int j = i;
            int idx = j;
            while (j + 1 < n && prices[j] <= prices[j+1]) {    
                j++;
            }
            profit += prices[j] - prices[idx];
            i = j;
        }
        return profit;
    }
}