// Last updated: 10/20/2025, 11:32:57 AM
class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int ans = 0;
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                ans = -1;
                break;
            }
            ans += (map.get(key) + 2) / 3;
        }

        return ans;
    }
}