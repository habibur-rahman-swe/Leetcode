// Last updated: 10/20/2025, 11:41:25 AM
class Solution {
    public int minAddToMakeValid(String s) {
        int unbalanced = 0, stack = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                ++stack;
            } else {
                if (stack > 0) {
                    --stack;
                } else {
                    ++unbalanced;
                }
            }
        }
        return unbalanced + stack;
    }
}