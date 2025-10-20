// Last updated: 10/20/2025, 11:42:31 AM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char min = '1';
        boolean flag = false;

        for (char c : letters) {
            if (c > target) {
                if (!flag) {
                    min = c;
                    flag = true;
                } else {
                    if (c < min) {
                        min = c;
                    }
                }
            }
        }
        if (min == '1') return letters[0];
        return min;
    }
}