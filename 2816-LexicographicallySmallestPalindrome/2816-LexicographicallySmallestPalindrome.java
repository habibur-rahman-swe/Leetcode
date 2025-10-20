// Last updated: 10/20/2025, 11:33:28 AM
class Solution {
    public String makeSmallestPalindrome(String s) {
        
        int l = 0, r = s.length() - 1;
        char[] str = s.toCharArray();
        
        while (l < r) {
            if (str[l] < str[r]) str[r] = str[l];
            else str[l] = str[r];
            l++;
            r--;
        }
        return String.valueOf(str);
    }
}