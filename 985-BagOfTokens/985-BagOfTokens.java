// Last updated: 10/20/2025, 11:41:13 AM
class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int left = 0, right = tokens.length - 1;
        int ans = 0, score = 0;
        while (left <= right) {
            if (power >= tokens[left]) {
                power -= tokens[left];
                ++score;
                left++;
            } else {
                if (score > 0) {
                    power += tokens[right];
                    --score;
                    right--;
                } else {
                    break;
                }
            }
            ans = Math.max(ans, score);
        }
        return ans;
    }
}