// Last updated: 10/20/2025, 11:44:12 AM
class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int hasOdd = 0;
        int ans = 0;

        for (char c : map.keySet()) {
            ans += (map.get(c)/2)*2;
            if (map.get(c) % 2 == 1) hasOdd = 1;
        }
        return ans + hasOdd;
    }
}