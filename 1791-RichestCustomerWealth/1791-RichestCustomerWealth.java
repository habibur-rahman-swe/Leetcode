// Last updated: 10/20/2025, 11:38:02 AM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum = 0, temp = 0;
        for (int[] x : accounts) {
            temp = 0;
            for (int y : x) temp += y;
            sum = Math.max(sum, temp);
        }
        return sum;
    }
}