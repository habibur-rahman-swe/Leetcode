// Last updated: 10/20/2025, 11:33:40 AM
class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int x : nums) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }
        
        int[] ans = new int[nums.length];
        HashMap<Integer, Integer> pm = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            pm.put(nums[i], pm.getOrDefault(nums[i], 0) + 1);
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) - 1);
            
            if (hm.get(nums[i]) <= 0) {
                hm.remove(nums[i]);
            }
            
            ans[i] = pm.size() - hm.size();
        }
        return ans;
    }
}