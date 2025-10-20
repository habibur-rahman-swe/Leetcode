// Last updated: 10/20/2025, 11:36:22 AM
class Solution {
    public int minimumCost(int[] cost) {
        int n = cost.length;
        Arrays.sort(cost);
        int idx = n - 1, i = 1, sum = 0;
        while (idx >= 0) {
            if (i != 0) sum += cost[idx];
            idx--;
            i = (i + 1) % 3;
        }
        return sum;
    }
}