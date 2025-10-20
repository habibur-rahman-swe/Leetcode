// Last updated: 10/20/2025, 11:31:57 AM
class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int happinessSize = happiness.length;

        Integer[] happinessArray = new Integer[happinessSize];
        for (int i = 0; i < happinessSize; i++) {
            happinessArray[i] = happiness[i];
        }
        Arrays.sort(happinessArray, Collections.reverseOrder());
        
        long totalHappinessSum = 0;

        for (int i = 0; i < k; i++) {
            totalHappinessSum += Math.max(happinessArray[i] - i, 0);
        }

        return totalHappinessSum;
    }
}