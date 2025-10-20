// Last updated: 10/20/2025, 11:33:52 AM
class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        int max = 0;
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            max = Math.max(max, map.get(num));
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            result.add(new ArrayList<>());
        }

        for (int num : nums) {
            int cnt = map.get(num);
            if (cnt == 0) continue;
            result.get(cnt-1).add(num);
            map.put(num, cnt - 1);
        }
        return result;
    }
}