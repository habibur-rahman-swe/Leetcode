// Last updated: 10/20/2025, 11:35:49 AM
class Solution {
    public boolean digitCount(String num) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (char c : num.toCharArray()) {
            int x = c - '0';
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }
        
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) - '0' == hm.getOrDefault(i, 0)) continue;
            else return false;
        }
        return true;
    }
}