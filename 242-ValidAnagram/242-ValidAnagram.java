// Last updated: 10/20/2025, 11:45:10 AM
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] a = new int[26];
        int[] b = new int[26];
        if (s.length() != t.length()) return false;
        for (char c : s.toCharArray()) {
            a[c-'a']++;
        }
        
        for (char c : t.toCharArray()) {
            b[c-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}