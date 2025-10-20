// Last updated: 10/20/2025, 11:39:21 AM
class Solution {
    public String generateTheString(int n) {
        String s = "";
        int x, y = 0;
        if (n % 2 == 0) {
            x = n - 1;
            y = 1;
        }
        else {
            x = n;
            y = 0;
        }
        for (int i = 0; i < x; i++) s += "a";
        for (int j = 0; j < y; j++) s += "b";
        
        return s;
    }
}