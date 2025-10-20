// Last updated: 10/20/2025, 11:40:39 AM
class Solution {
    public int longestStrChain(String[] str) {
        int n = str.length;
        int[] ans = new int[n];
		Arrays.fill(ans, 1);
		Arrays.sort(str, (a, b)->Integer.compare(a.length(), b.length()));
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (str[j].length() + 1 == str[i].length() && diff(str[j], str[i])) {
					ans[i] = Math.max(ans[i], ans[j] + 1);
				}
			}
		}
		
		int max = 0;
		
		for (int x : ans) {
			max = Math.max(max, x);
		}
        return max;
    }
    private boolean diff(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		int l1 = c1.length;
		int l2 = c2.length;
		
		int i = 0, j = 0;
		
		while (i < l1 && j < l2) {
			if (c1[i] == c2[j]) {
				++i;
				++j;
			} else {
				++j;
			}
		}
		
		return (i == l1 && j == l2) || (i == j);
	}
}