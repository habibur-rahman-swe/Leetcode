// Last updated: 10/20/2025, 11:41:41 AM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(pile, max);
        }
        int left = 1, right = max;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int needHour = 0;
            for (int pile : piles) {
                needHour += (pile + mid - 1) / mid;
            }
            if (needHour <= h) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
}