// Last updated: 10/20/2025, 11:38:27 AM
class Solution {
    public int minCost(String colors, int[] neededTime) {
        int res = 0, sum = 0, maxSum = 0, max = 0;
        char prev = ' ';
        for (int i = 0; i < colors.length(); i++) {
            if (colors.charAt(i) == prev) {
                max = Math.max(max, neededTime[i]);
            } else {
                maxSum += max;
                max = neededTime[i];
            }
            sum += neededTime[i];
            prev = colors.charAt(i);
        }
        maxSum += max;
        
        return sum - maxSum;
    }
}