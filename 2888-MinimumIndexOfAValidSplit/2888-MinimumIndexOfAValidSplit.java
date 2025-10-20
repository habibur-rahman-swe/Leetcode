// Last updated: 10/20/2025, 11:33:12 AM
class Solution {
    public int minimumIndex(List<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        
        for (int i = 0; i < nums.size(); i++) {
            int x = nums.get(i);
            map2.put(x, map2.getOrDefault(x , 0) + 1);
            int m1 = map2.get(x);
            int m2 = map.get(x) - map2.get(x);
            
            if (m1 * 2 > i + 1 && m2 * 2 >= nums.size() - i) return i;
        }
        
        
        return -1;
    }
}