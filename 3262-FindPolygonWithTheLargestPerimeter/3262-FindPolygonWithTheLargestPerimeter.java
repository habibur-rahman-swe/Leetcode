// Last updated: 10/20/2025, 11:32:08 AM
class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long previousElementsSum = 0;
        long ans = -1;
        for (int num : nums) {
            if (num < previousElementsSum) {
                ans = num + previousElementsSum;
            }
            previousElementsSum += num;
        }
        return ans;
    }
}