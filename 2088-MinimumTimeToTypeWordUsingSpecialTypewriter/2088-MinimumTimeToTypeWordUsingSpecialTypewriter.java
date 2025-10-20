// Last updated: 10/20/2025, 11:37:00 AM
class Solution {
    public int minTimeToType(String word) {
        if (word.length() == 0) return 0;
        int x1, x2;
        x1 = Math.abs(word.charAt(0) - 'a');
        x2 = Math.abs(26 - x1);
        int ans = Math.min(x2, x1) + 1;
        for (int i = 1; i < word.length(); i++) {
            x1 = Math.abs(word.charAt(i-1) - word.charAt(i));
            x2 = Math.abs(26-x1);
            ans += Math.min(x1,x2) + 1;
        }
        return ans;
    }
}