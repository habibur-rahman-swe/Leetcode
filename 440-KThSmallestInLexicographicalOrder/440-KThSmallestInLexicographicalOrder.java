// Last updated: 10/20/2025, 11:44:07 AM
class Solution {
    public int findKthNumber(int n, int k) {
        int curr = 1;
        k--;

        while (k > 0) {
            int steps = countSteps(n, curr, curr+1);
            if (steps <= k) {
                k -= steps;
                ++curr;
            } else {
                curr *= 10;
                k -= 1;
            }
        }
        return curr;
    }
    private int countSteps(int n, long curr, long next) {
        int steps = 0;
        while (curr <= n) {
            steps += Math.min(n + 1, next) - curr;
            curr *= 10;
            next *= 10;
        }
        return steps;
    }
}