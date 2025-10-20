// Last updated: 10/20/2025, 11:33:05 AM
class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String c = "";
        for (String x : words) {
            c += x.charAt(0);
        }
        return c.equals(s);
    }
}