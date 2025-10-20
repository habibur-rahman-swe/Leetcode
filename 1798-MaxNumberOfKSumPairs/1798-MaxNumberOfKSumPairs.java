// Last updated: 10/20/2025, 11:37:59 AM
class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int x : nums) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }


        int cnt = 0;

        for (int x : hm.keySet()) {
            if (hm.containsKey(x) && hm.containsKey(k - x) && x != k - x) {
                int min = hm.get(x) < hm.get(k - x) ? hm.get(x) : hm.get(k - x);
                cnt += min;
                
                hm.put(x, hm.get(x) - min);
              
                hm.put(k - x, hm.get(k - x) - min);
            }
        }

        cnt += (hm.containsKey(k / 2) && k % 2 == 0) ? hm.get(k/2) / 2 : 0;

        return cnt;
    }
}