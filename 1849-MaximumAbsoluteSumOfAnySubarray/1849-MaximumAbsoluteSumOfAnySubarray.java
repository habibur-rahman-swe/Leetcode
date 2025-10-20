// Last updated: 10/20/2025, 11:37:41 AM
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int minPrefixSum = Integer.MAX_VALUE, maxPrefixSum = Integer.MIN_VALUE;
        int prefixSum = 0, maxAbsSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            minPrefixSum = Math.min(minPrefixSum, prefixSum);
            maxPrefixSum = Math.max(maxPrefixSum, prefixSum);

            if (prefixSum >= 0) {
                maxAbsSum = Math.max(
                    maxAbsSum,
                    Math.max(prefixSum, prefixSum - minPrefixSum)
                );
            } else {
                maxAbsSum = Math.max(
                    maxAbsSum,
                    Math.max(
                        Math.abs(prefixSum),
                        Math.abs(prefixSum - maxPrefixSum)
                    )
                );
            }
        }
        return maxAbsSum;
    }
}