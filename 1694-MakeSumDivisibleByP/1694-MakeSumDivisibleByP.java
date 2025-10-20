// Last updated: 10/20/2025, 11:38:28 AM
class Solution {
    public int minSubarray(int[] nums, int p) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
            totalSum %= p;
        }
        
        if (totalSum == 0) return 0;
        
        int minLen = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int currentSum = 0;
        int needed = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum = (currentSum + nums[i]) % p;
            needed = (currentSum - totalSum + p) % p;

            if (map.containsKey(needed)) {
                minLen = Math.min(minLen, i - map.get(needed));
            }
            map.put(currentSum, i);
        }
        return minLen == nums.length ? -1 : minLen;
    }
}