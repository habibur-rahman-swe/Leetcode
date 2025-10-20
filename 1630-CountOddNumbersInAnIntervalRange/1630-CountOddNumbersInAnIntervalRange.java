// Last updated: 10/20/2025, 11:38:40 AM
class Solution {
    public int countOdds(int low, int high) {
        return ((high - low) / 2 + ((high % 2 == 1 || low % 2 == 1) ? 1 : 0));
    }
}