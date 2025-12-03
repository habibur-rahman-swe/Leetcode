# Last updated: 12/3/2025, 4:07:40 PM
1class Solution(object):
2    def maxProfit(self, prices):
3        min_price = float('inf')
4        max_profit = 0
5
6        for price in prices:
7            min_price = min(min_price, price)
8            max_profit = max(max_profit, price - min_price)
9
10        return max_profit
11        