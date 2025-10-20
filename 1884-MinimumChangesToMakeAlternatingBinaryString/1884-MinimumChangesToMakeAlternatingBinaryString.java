// Last updated: 10/20/2025, 11:37:33 AM
class Solution {
    public int minOperations(String s) {
        int cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == '0') ++cnt1;
                else ++cnt2;
            } else {
                if (s.charAt(i) == '1') ++cnt1;
                else ++cnt2;
            }
        }

        return Math.min(cnt1, cnt2);
    }
}