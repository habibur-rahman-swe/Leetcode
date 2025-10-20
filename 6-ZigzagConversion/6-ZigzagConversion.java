// Last updated: 10/20/2025, 11:49:12 AM
class Solution {
    public String convert(String s, int numRows) {
        String[] result = new String[numRows];
        Arrays.fill(result, "");
        int idx = 0;
        while (idx < s.length()) {
            int row = 0, col = 0;
            while (idx < s.length() && row < numRows) {
                result[row] += s.charAt(idx);
                row++;
                idx++;
            }
            row = numRows - 2;

            while (row > 0 && idx < s.length()) {
                result[row] += s.charAt(idx);
                idx++;
                row--;
            }
        }
        String ans = "";
        for (String x : result) ans += x;
        return ans;
    }
}