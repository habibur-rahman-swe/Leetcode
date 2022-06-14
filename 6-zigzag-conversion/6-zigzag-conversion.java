class Solution {
    public String convert(String s, int numRows) {
		int n = s.length();
		int r = numRows;
		if (r == 1) return s;
		char arr[] = new char[n];
		int idx = 0, k = 2 * (r - 1);
		
		for (int i = 0; i < r; i++) {
			if (i == 0 || i == r - 1) {
				k = 2 * (r - 1);
				for (int j = i; j < n; j+=k) {
					arr[idx] = s.charAt(j);
					idx++;
				}
			} else {
				k = 2 * (r - 1 - i);
				for (int j = i; j < n;) {
					arr[idx] = s.charAt(j);
					idx++;
					j += k;
					k = 2 * (r-1) - k;
				}
			}
		}
        return String.valueOf(arr);
    }
}