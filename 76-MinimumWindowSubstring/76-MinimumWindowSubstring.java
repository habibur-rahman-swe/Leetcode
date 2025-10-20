// Last updated: 10/20/2025, 11:47:32 AM
class Solution {
    public String minWindow(String s, String t) {
        int[] map = new int[128];
        int begin = 0, end = 0, start = -1, minLength = Integer.MAX_VALUE;
        int counter = t.length();

        for (char c : t.toCharArray()) {
            map[c]++;
        }

        while (end < s.length()) {
            if (map[s.charAt(end)]-- > 0) {
                counter--;
            }
            while (counter == 0) {
                if (end - begin + 1 < minLength) {
                    start = begin;
                    minLength = end - begin + 1;
                }
                if (map[s.charAt(begin)]++ == 0) {
                    ++counter;
                }
                begin++;
            }
            end++;
        }

        return start == -1 ? "" : s.substring(start, start + minLength);
    }
}