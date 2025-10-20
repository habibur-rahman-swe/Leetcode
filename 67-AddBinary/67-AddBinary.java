// Last updated: 10/20/2025, 11:47:44 AM
class Solution {
    public String addBinary(String a, String b) {
        if (a.length() == 0) return b;
        if (b.length() == 0) return a;
        int carry = 0;
        String res = "";
        int sum = 0;

        for (int i = 0; i < Math.max(a.length(), b.length()); i++) {
            sum = carry;
            if (a.length() - i - 1 >= 0) {
                sum += a.charAt(a.length() - i - 1) - '0';
            }
            if (b.length() - i - 1 >= 0) {
                sum += b.charAt(b.length() - i - 1) - '0';
            }
            if (sum == 3) {
                res = '1' + res;
                carry = 1;
            } else if (sum == 2) {
                res = '0' + res;
                carry = 1;
            } else if (sum == 1) {
                res = '1' + res;
                carry = 0;
            } else {
                res = '0' + res;
                carry = 0;
            }
        }
        if (carry > 0) res = "1" + res;
        return res;
    }
}