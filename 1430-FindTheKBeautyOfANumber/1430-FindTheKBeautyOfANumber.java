// Last updated: 10/20/2025, 11:39:34 AM
class Solution {
    public int divisorSubstrings(int num, int k) {
        String str = String.valueOf(num);
		int cnt = 0;
		for (int i = 0; i < str.length() - k + 1; i++) {
			int x = Integer.parseInt(str.substring(i, i+k));
			if (x != 0 && num % x == 0) ++cnt;
		}
        return cnt;
    }
}