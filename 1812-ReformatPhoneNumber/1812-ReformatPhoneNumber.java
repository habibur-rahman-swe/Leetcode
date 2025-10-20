// Last updated: 10/20/2025, 11:37:53 AM
class Solution {
    public String reformatNumber(String number) {
        String str = number;
        String s = new String();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <='9') s += ch;
        }
        int len = s.length();

        String ans = new String();
        ans += s.charAt(0);
        if (len < 4) {
            ans = s;
        }
        else if (len == 4) {
            ans += s.charAt(1);
            ans += '-';
            ans += s.charAt(2);
            ans += s.charAt(3);
        }
        else if ( len % 3 == 1) {
            
            for (int i = 1; i < len - 4; i++) {
                if (i % 3 == 0) ans += '-';
                ans += s.charAt(i);
            }
            if (len > 4)
                ans += '-';
            ans += s.charAt(len - 4);
            ans += s.charAt(len - 3);
            ans += '-';
            ans += s.charAt(len - 2);
            ans += s.charAt(len - 1);
        }

        else if (len % 3 == 2) {
            for (int i = 1; i < len - 2; i++) {
                if (i % 3 == 0) ans += '-';
                ans += s.charAt(i);
            }
            ans += '-';
            ans += s.charAt(len - 2);
            ans += s.charAt(len - 1);
        }
        else {
            for (int i = 1; i < len ; i++) {
                if (i % 3 == 0) ans += '-';
                ans += s.charAt(i);
            }
        }
        
        return ans;
    }
}