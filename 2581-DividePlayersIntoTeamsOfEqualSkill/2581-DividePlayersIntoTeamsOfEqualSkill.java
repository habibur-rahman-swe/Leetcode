// Last updated: 10/20/2025, 11:34:54 AM
class Solution {
    public long dividePlayers(int[] skill) {
        
        if (skill.length == 2) return 1l * skill[0] * skill[1];

        Map<Long, Long> map = new HashMap<>();
        long sum = getSum(0, skill), ans = 0;
        int n = skill.length / 2;
        long target = sum / n;

        for (int x : skill) {
            if (map.containsKey(target - x)) {
                ans += x * (target - x);
                map.put(target - x, map.get(target - x) - 1);

                if (map.get(target - x) == 0) map.remove(target - x);
            } else {
                map.put(x * 1l, map.getOrDefault(x * 1l, 0l) + 1);
            }
           
        }
        
        return map.size() == 0 ? ans : -1l;
    }
    private long getSum(int idx, int[] arr) {
        if (idx == arr.length) return 0l;
        return arr[idx++] + getSum(idx, arr);
    }
}