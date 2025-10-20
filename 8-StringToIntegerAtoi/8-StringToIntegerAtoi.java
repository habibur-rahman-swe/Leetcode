// Last updated: 10/20/2025, 11:49:09 AM
class Solution {
    public int myAtoi(String s) {
        long num = 0;
        int plus = 0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        
        for (char c : s.toCharArray()) {
            if (c == ' ' && plus == 0) {
                continue;
            } else if (c >= '0' && c <= '9') {
                num = num * 10 + c - '0';
                if (plus == 0) plus = 1;
            } else if (c == '-' || c == '+') {
                if (plus != 0) break;
                if (c == '-') {
                    plus = -1;
                }
                else plus = 1;
            } else {
                break;
            }
            if (num * plus > max) return max;
            if (num * plus < min) return min;
        }
        return (int) num * plus;
    }
}