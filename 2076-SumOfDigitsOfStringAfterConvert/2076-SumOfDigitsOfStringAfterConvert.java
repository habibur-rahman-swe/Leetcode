// Last updated: 10/20/2025, 11:37:03 AM
class Solution {
    public int getLucky(String s, int k) {
        int ans = 0;
		for (char ch : s.toCharArray()) {
			int x = ch - 'a' + 1;
			int temp = x;
			while (temp > 0) {
				ans += temp % 10;
				temp /= 10;
			}
		}
		
		for (int i = 1; i < k; i++) {
			int temp = ans;
			ans = 0;
			while (temp > 0) {
				ans += temp % 10;
				temp /= 10;
			}
		}
        return ans;
    }
}