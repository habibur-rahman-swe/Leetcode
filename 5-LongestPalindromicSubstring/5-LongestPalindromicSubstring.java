// Last updated: 10/20/2025, 11:49:13 AM
class Solution {
    public String longestPalindrome(String s) {
        int left, right;
        
        int n = s.length();
        int start = 0, end = 0;
        String res = "";
        int tl = 0, tr = 0;
        
        for (int i = 0; i < n; i++) {
            left = i;
            right = i;
            
            tl = i - (end - start)/2;
            tr = i + (end - start)/2;
            if (tl >= 0 && tr < n && s.charAt(tl) == s.charAt(tr))
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            if (right - left - 1 > end - start) {
                start = left + 1;
                end = right;
            }
            left = i;
            right = i + 1;
            tl = i - (end - start)/2;
            tr = i + (end - start)/2+1;
            if (tl >= 0 && tr < n && s.charAt(tl) == s.charAt(tr))
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            if (right - left - 1 > end - start) {
                start = left + 1;
                end = right;
            }
        }
        
        res = s.substring(start, end);
        
        return res;
    }
}