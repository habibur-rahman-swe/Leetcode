// Last updated: 10/20/2025, 11:37:54 AM
class Solution {
    public int minPartitions(String n) {
        char ch = '0';
        for (char c : n.toCharArray()) {
            if (ch < c) ch = c;
        }
        if (ch == '0') return 1;
        return ch - '0';
    }
}