class Solution {
    public int removePalindromeSub(String s) {
        if (s.length() == 0) return 0;
        if (isPalindrom(s)) return 1;
        return 2;
    }
    public boolean isPalindrom(String s) {
        int l = 0, r = s.length() - 1;
        while(l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }
}