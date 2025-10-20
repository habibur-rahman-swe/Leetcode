// Last updated: 10/20/2025, 11:32:38 AM
class Solution {
    public int minChanges(String s) {
        int o = 0, z = 0, cnt = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') ++o; else ++z;
            o %= 2; z %= 2;
            if (o % 2 == 1 && z == o) {++cnt; o = z = 0;}
        }
        return cnt;
    }
}