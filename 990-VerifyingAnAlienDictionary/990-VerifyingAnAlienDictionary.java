// Last updated: 10/20/2025, 11:41:10 AM
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            hm.put(order.charAt(i), i);
        }

        for (int i = 1; i < words.length; i++) {
            if (isLaxicographical(words[i-1], words[i], hm)) continue;
            else return false;
        }

        return true;
    }

    public boolean isLaxicographical(String s1, String s2, HashMap<Character, Integer> hm) {
        for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
            if (hm.get(s1.charAt(i)) == hm.get(s2.charAt(i))) continue;
            else if (hm.get(s1.charAt(i)) < hm.get(s2.charAt(i))) return true;
            else return false;
        }
        if (s1.length() <= s2.length()) return true;
        return false;
    }

}