// Last updated: 10/20/2025, 11:36:30 AM
class Solution {
    public String capitalizeTitle(String title) {
        String[] s = title.split(" ");
        String res = "";
        for (int i = 0; i < s.length; i++) {
            String x = s[i];
            if (x.length() > 2) {
                res += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase();
            } else {
                res += x.toLowerCase();
            }
            if (i != s.length - 1) res += " ";
        }
        return res;
    }
}