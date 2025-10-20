// Last updated: 10/20/2025, 11:34:50 AM
class Solution {
    public int similarPairs(String[] words) {
        int n = words.length;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isSame(words[i], words[j])) ++cnt;
            }
        }
        return cnt;
    }
    public boolean isSame(String s1, String s2) {
        int[] a = new int[26];
        int[] b = new int[26];
        for (char c : s1.toCharArray()) {
            a[c-'a'] = 1;
        }
        for (char c : s2.toCharArray()) {
            b[c-'a'] = 1;
        }
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}