// Last updated: 10/20/2025, 11:33:42 AM
class Solution {
    public int buyChoco(int[] prices, int money) {
        int min = 200;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                min = Math.min(min, prices[i] + prices[j]);
            }
        }
        return min > money ? money : money - min;
    }
}