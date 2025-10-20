// Last updated: 10/20/2025, 11:35:42 AM
class Solution {
    public boolean strongPasswordCheckerII(String p) {
        int n = p.length();
        if (n < 8) return false;
		boolean l = false;
		boolean u = false;
		boolean d = false;
		boolean s = false;
		for (int i = 0; i < n; i++) {
            char c = p.charAt(i);
            if (c >= '0' && c <= '9') d = true;
            else if (c >= 'a' && c <= 'z') l = true;
            else if (c >= 'A' && c <= 'Z') u = true;
            else s = true;
            if (i > 0 && p.charAt(i) == p.charAt(i-1)) return false;
        }
        return (l&u&d&s);
    }
}