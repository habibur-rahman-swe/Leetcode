// Last updated: 10/20/2025, 11:41:00 AM
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] mod = new int[k];
        int result = 0, prefixSum = 0;
        mod[0] = 1;
        for (int num : nums) {
            prefixSum = (prefixSum + num % k + k) % k;
            result += mod[prefixSum];
            mod[prefixSum]++;
        }
        return result;
    }
}