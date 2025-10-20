// Last updated: 10/20/2025, 11:44:08 AM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        int[] a = new int[26];
        for (char c : p.toCharArray()) {
            a[c - 'a']++;
        }
        int[] b = new int[26];

        for (int i = 0; i < s.length(); i++) {
            b[s.charAt(i) - 'a']++;
            if (i >= p.length() - 1) {
                if (isEqual(a, b)) result.add(i - p.length() + 1);
                b[s.charAt(i - p.length() + 1) - 'a']--;
            }
        }
        return result;
    }
    private boolean isEqual(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}