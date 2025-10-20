// Last updated: 10/20/2025, 11:44:54 AM
class Solution {
    public int lengthOfLIS(int[] nums) {
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        tm.put(0, 0);
        for (int x : nums) {
            int maxVal = 0;
            for (int y : tm.keySet()) {
                if (y >= x) {
                    break;
                }
                maxVal = Math.max(maxVal, tm.get(y));
            }
            tm.put(x, maxVal + 1);
        }

        int max = 0;
        for (int key : tm.keySet()) {
            max = Math.max(max, tm.get(key));
        }

        System.out.println(tm);

        return max;
    }
}