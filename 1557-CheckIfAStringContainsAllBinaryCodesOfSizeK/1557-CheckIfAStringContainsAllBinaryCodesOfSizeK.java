// Last updated: 10/20/2025, 11:38:59 AM
class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i <= s.length() - k; i++) {
            set.add(s.substring(i, i+k));
        }
        return set.size() == (int)Math.pow(2,k);
    }
}