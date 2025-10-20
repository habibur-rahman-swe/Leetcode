// Last updated: 10/20/2025, 11:46:32 AM
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        TreeSet<Integer> ts = new TreeSet<>();
        
        for (int x : nums) ts.add(x);
		
		int ans = 1, prev = ts.first(), cnt = 1;
		
		ts.pollFirst();
		
		for (int x : ts) {
			if (prev + 1 == x) {
				++cnt;
			} else {
				cnt = 1;
			}
			ans = Math.max(ans, cnt);
			prev = x;
		}
        return ans;
    }
}