// Last updated: 10/20/2025, 11:35:55 AM
class Solution {
    public int waysToSplitArray(int[] nums) {
        long totalSum = IntStream.of(nums).asLongStream().sum();

       long currSum[] = {0};

        return (int)IntStream.range(0, nums.length - 1)
                .filter(i -> {
                    currSum[0] += nums[i];
                    return currSum[0] >= totalSum - currSum[0];
                })
                .count();
    }
}