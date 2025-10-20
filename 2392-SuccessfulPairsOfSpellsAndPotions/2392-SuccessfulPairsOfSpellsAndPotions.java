// Last updated: 10/20/2025, 11:35:41 AM
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] ans = new int[spells.length];
        for (int i = 0; i < spells.length; i++) {
            if ((long)spells[i] * potions[potions.length - 1] >= success) {
                ans[i] = getIndex(potions, spells[i], success);
            }
        }
        return ans;
    }

    public int getIndex(int[] potions, long tSuccess, long success) {
        int l = 0, r = potions.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (tSuccess * potions[mid] >= success) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return potions.length - l;
    }
}