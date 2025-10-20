// Last updated: 10/20/2025, 11:33:58 AM
class Solution {
    public int[] divisibilityArray(String word, int m) {
        long num = 0;
        int[] div = new int[word.length()];
        for (int i = 0; i < word.length(); i++) {
            num = num * 10 + word.charAt(i) - '0';
            if (num % m == 0) div[i] = 1;
            else div[i] = 0;
            num %= m;
        }
        return div;
    }
}