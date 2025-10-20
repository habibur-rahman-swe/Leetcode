// Last updated: 10/20/2025, 11:39:59 AM
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int x : arr) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }

        Set<Integer> set = new HashSet<>();
        for (int x : hm.keySet()) {
            if (set.contains(hm.get(x))) return false;
            set.add(hm.get(x));
        }
        return true;
    }
}