// Last updated: 10/20/2025, 11:42:09 AM
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        boolean flag = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == goal.charAt(0)) {
                flag = true;
                for (int j = 0; j < goal.length(); j++) {
                    if (s.charAt((i + j) % s.length()) != goal.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) return true;
            }
        }
        return false;
    }
}