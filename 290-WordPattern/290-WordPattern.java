// Last updated: 10/20/2025, 11:44:56 AM
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hm = new HashMap<>();
        String[] str = s.split(" ");
        if (str.length != pattern.length()) return false;
        HashSet<String> hs = new HashSet<>();

        for (int i = 0; i < str.length; i++) {
            hs.add(str[i]);
            int idx = i % pattern.length();
            if (!hm.containsKey(pattern.charAt(idx))) {
                hm.put(pattern.charAt(idx), str[i]);
            }
            if (str[i].compareTo(hm.get(pattern.charAt(idx))) != 0) {
                return false;
            }
        }
        return hs.size() == hm.size();
    }
}