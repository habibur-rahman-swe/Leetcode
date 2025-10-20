// Last updated: 10/20/2025, 11:41:32 AM
class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0, right = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (right = 0; right < fruits.length; right++) {
            hm.put(fruits[right], hm.getOrDefault(fruits[right], 0) + 1);

            if (hm.size() > 2) {
                hm.put(fruits[left], hm.get(fruits[left]) - 1);
                if (hm.get(fruits[left]) == 0) {
                    hm.remove(fruits[left]);
                }
                left++;
            }
        }
        return right - left;
    }
}