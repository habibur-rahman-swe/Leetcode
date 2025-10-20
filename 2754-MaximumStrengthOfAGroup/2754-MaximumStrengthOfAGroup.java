// Last updated: 10/20/2025, 11:33:45 AM
class Solution {
    public long maxStrength(int[] nums) {
        long ans = 1;
        
        int max = Integer.MIN_VALUE;
        Queue<Integer> positive = new PriorityQueue<>((a, b) -> (b - a));
        Queue<Integer> negative = new PriorityQueue<>((a, b) -> (a - b));
        
        for (int x : nums) {
            if (x > 0) positive.add(x);
            if (x < 0) negative.add(x);
            max = Math.max(max, x);
        }
        
        if (positive.size() == 0) {
            if (negative.size() <= 1 && nums.length > 1) return 0;
            if (nums.length == 1) return nums[0];
        }
        
        while (!negative.isEmpty() || !positive.isEmpty()) {
            if (!positive.isEmpty()) {
                ans *= positive.poll() * 1l;
            }
            
            if (negative.size() > 1) {
                ans *= negative.poll() * 1l;
                ans *= negative.poll() * 1l;
            }
            if (negative.size() <= 1 && positive.size() == 0) break;
        }
        return Math.max(max * 1l, ans);
    }
}