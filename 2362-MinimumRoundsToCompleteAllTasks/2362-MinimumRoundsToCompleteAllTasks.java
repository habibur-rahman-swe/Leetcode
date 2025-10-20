// Last updated: 10/20/2025, 11:35:53 AM
class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : tasks) map.put(x, map.getOrDefault(x, 0) + 1);
        int ans = 0;
        for (int x : map.keySet()) {
            int y = map.get(x);
            if (y == 1) {
                ans = -1;
                break;
            } else {
                ans += Math.min((y + 1) / 2, (y + 2) / 3);
            }
        }
        return ans;
    }
}