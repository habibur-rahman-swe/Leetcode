// Last updated: 10/20/2025, 11:32:43 AM
class Solution {
    public int minGroupsForValidAssignment(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int min = Integer.MAX_VALUE;
        
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        for (int key : hm.keySet()) {
            min = Math.min(hm.get(key), min);
        }

        int ans = 0;
        
        for (int x = min + 1; x >= 0 && ans == 0; x--) {
            for (int key : hm.keySet()) {
                int y = hm.get(key);

                if (y % (x + 1) == 0) {
                    ans += y / (x + 1);
                }
                else {
                    if (x - y % (x + 1) <= y / (x + 1)) {
                        ans += y / (x + 1) + 1;
                    }
                    else {
                        ans = 0;
                        break;
                    }
                }
            }
        }
        
        return ans;
    }
}