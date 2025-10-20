// Last updated: 10/20/2025, 11:42:30 AM
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        for (int i = 2; i < cost.length; i++) {
            cost[i] = cost[i] + Math.min(cost[i-1], cost[i-2]);
        }
        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }
}