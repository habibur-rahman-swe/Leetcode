// Last updated: 10/20/2025, 11:37:47 AM
class Solution {
    public int largestAltitude(int[] gain) {
        int max = gain[0];
        int sum = 0;
        for (int x : gain) {
            sum += x;
            max = Math.max(sum, max);
        }
        return Math.max(0, max);
    }
}