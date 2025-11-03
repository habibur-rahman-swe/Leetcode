// Last updated: 11/3/2025, 1:11:49 PM
class Solution {
    public int minCost(String colors, int[] neededTime) {
        int totalMax = 0;
        int totalSum = 0;
        int max = 0;
        char prev = '#';

        for (int i = 0; i < colors.length(); i++) {
            if(colors.charAt(i) == prev) {
                max = Math.max(max, neededTime[i]);
            } else {
                totalMax += max;
                max = neededTime[i];
            }
            totalSum += neededTime[i];
            prev = colors.charAt(i);
        }
        totalMax += max;
        return totalSum - totalMax;
    }
}