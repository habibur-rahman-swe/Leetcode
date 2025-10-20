// Last updated: 10/20/2025, 11:37:13 AM
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int cnt = 0;
        for (int x : costs) {
            if (coins - x >= 0) {
                coins -= x;
                ++cnt;
            }
        }
        return cnt;
    }
}