// Last updated: 10/20/2025, 11:33:02 AM
class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        
        int i1 = 0, i2 = 0;
        
        while (i1 < s1.length && i2 < s2.length) {
            if (s2[i2] == s1[i1]) {
                ++i1;
                ++i2;
            } else if (s2[i2] == s1[i1] + 1 || s2[i2] == 'a' && s1[i1] == 'z') {
                ++i1;
                ++i2;
            } else {
                ++i1;
            }
        }
        return i2 == s2.length;
    }
}