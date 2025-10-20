// Last updated: 10/20/2025, 11:36:01 AM
class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for (String w : words) {
            if (s.contains(w) && s.indexOf(w) == 0) ++count;
        }
        return count;
    }
}