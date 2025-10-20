// Last updated: 10/20/2025, 11:37:39 AM
class Solution {
    public String maximumTime(String time) {
        char[] s = time.toCharArray();
        
        String result = "";
        
        if (s[0] == '?') {
            if ((s[1] >= '0' && s[1] <= '3') || s[1] == '?') result += "2";
            else result += "1";
        } else result += s[0];

        if (s[1] == '?') {
            if (s[0] == '2' || s[0] == '?') result += "3";
            else result += "9";
        } else result += s[1];

        result += ":";

        if (s[3] == '?') result += "5";
        else result += s[3];

        if (s[4] == '?') result += "9";
        else result += s[4];
        
        return result;
    }
}