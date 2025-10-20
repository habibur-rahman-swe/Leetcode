// Last updated: 10/20/2025, 11:35:27 AM
class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i] - i, map.getOrDefault(nums[i] - i, 0) + 1);
        }

        long tAns = 0;
        for (int x : map.keySet()) {
            tAns += (long)map.get(x) * (map.get(x) - 1) / 2;
        }

        long ans = nums.length * 1l * (nums.length - 1) / 2;

        return ans - tAns;
    }
}