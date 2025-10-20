// Last updated: 10/20/2025, 11:49:07 AM
class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        String str = new String();
        for (int i = s.length() - 1; i >= 0; i--) {
            str += s.charAt(i);
        }
        
        return (s.equals(str));
    }
}