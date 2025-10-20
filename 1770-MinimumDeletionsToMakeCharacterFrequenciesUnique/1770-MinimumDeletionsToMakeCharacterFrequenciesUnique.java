// Last updated: 10/20/2025, 11:38:08 AM
class Solution {
    public int minDeletions(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        int ans = 0;
		HashSet<Integer> hs = new HashSet<>();
		for (int x : hm.values()) {
			while (x > 0 && hs.contains(x)) {
				x--;
				++ans;
			}
			if (x > 0) hs.add(x);
		}
        return ans;
    }
}