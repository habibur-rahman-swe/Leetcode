// Last updated: 10/20/2025, 11:32:26 AM
class Solution {
    public long minimumSteps(String s) {
        char[] str = s.toCharArray();
        long sum = 0;
        for (int i = str.length - 1, j = str.length - 1; i >= 0; i--) {
            if (str[i] == '1' && str[j] == '0') {
                sum += j - i;
                str[i] = '0';
                str[j] = '1';
                j--;
            } else if (str[j] == '1') {
                j--;
            }
        }
        return sum;
    }
}