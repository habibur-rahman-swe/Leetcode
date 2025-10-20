// Last updated: 10/20/2025, 11:32:56 AM
class Solution {
    public int minSizeSubarray(int[] nums, int target) {
        int sum = 0, tSum = 0;
        for (int num : nums) sum += num;

        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1);

        int k = target / sum;

        target %= sum;
        int n = nums.length;
        
        if (target == 0) return k * n;
        
        int ans = n;

        for (int i = 0; i < 2 * n; i++) {
            tSum += nums[i % n];
            if (hm.containsKey(tSum - target)) {
                ans = Math.min(ans, i - hm.get(tSum - target));
            }
           
            hm.put(tSum, i);
        }
        return ans < n ? ans + k * n : -1;
    }
}