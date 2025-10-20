// Last updated: 10/20/2025, 11:38:45 AM
class Solution {
    public boolean canArrange(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            x %= k;
            if (x < 0) x += k;

            if (map.containsKey(k - x)) {
                map.put(k - x, map.get(k - x) - 1);
                if (map.get(k - x) == 0) {
                    map.remove(k - x);
                }
            } else {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
        }
        if (map.containsKey(0)) {
            map.remove(0);
        }
        
        return map.size() == 0;
    }
}