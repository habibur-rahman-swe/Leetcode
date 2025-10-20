// Last updated: 10/20/2025, 11:44:11 AM
class Solution {
    public String addStrings(String num1, String num2) {
        String s = "";
        int val, c = 0;
        char[] s1 = num1.toCharArray();
        char[] s2 = num2.toCharArray();
        int l1 = num1.length() - 1;
        int l2 = num2.length() - 1;
        while (l1 >= 0 && l2 >= 0) {
            val = s1[l1] + s2[l2] - '0' - '0' + c;
            c = val / 10;
            val = val % 10;
            s = (char)(val + '0') + s;
            --l1;
            --l2;
        }
        while (l1 >= 0) {
            val = s1[l1] - '0' + c;
            c = val / 10;
            val %= 10;
            s = (char)(val + '0') + s;
            --l1;
        }
        while (l2 >= 0) {
            val = s2[l2] - '0' + c;
            c = val / 10;
            val %= 10;
            s = (char)(val + '0') + s;
            --l2;
        }
        if (c != 0) s = (char) (c + '0') + s;
        return s;
    }
}