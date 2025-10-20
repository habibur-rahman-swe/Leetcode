// Last updated: 10/20/2025, 11:37:50 AM
class Solution {
    public boolean halvesAreAlike(String s) {
        int first = 0, second = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    if (i < s.length() / 2) ++first;
                    else ++second;
                }
        }
        return first == second;
    }
}