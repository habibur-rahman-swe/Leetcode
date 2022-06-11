class Solution {
    public int minOperations(int[] a, int x) {
        int n = a.length;
        int[] s1 = new int[n];
		int[] s2 = new int[n];
		
		s1[0] = a[0];
		s2[n-1] = a[n-1];
		
		for (int i = 1; i < n; i++) {
			s1[i] = s1[i-1] + a[i];
			s2[n-i-1] = s2[n-i] + a[n-i-1];
		}
		
		if (s1[n-1] < x) return -1;
		if (s1[n-1] == x) return n;
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < n; i++) {
			hm.put(s2[n-i-1], i);
		}
		
		int ans = n+1;
		
		for (int i = 0; i < n; i++) {
			if (s1[i] == x) ans = Math.min(ans, i+1);
			if (s2[i] == x) ans = Math.min(ans, n-i);
			if (hm.containsKey(x-s1[i])) {
				ans = Math.min(ans, i+1 + hm.get(x-s1[i]) + 1);
			}
		}
        return (ans == n+1) ? -1 : ans;
    }
}