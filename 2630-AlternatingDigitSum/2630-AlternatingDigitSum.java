// Last updated: 10/20/2025, 11:34:37 AM
class Solution {
    public int alternateDigitSum(int n) {
        char[] s = Integer.toString(n).toCharArray();
        int sum = 0;
        int sign = 1;
        
        for (char c : s) {
            sum += sign * (c - '0');
            sign *= -1;
        }
        return sum;
    }
}