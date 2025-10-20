// Last updated: 10/20/2025, 11:32:11 AM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for (int key : map.keySet()) {
            tm.put(map.get(key), tm.getOrDefault(map.get(key), 0) + 1);
        }

        return tm.lastKey() * tm.get(tm.lastKey());
    }
}