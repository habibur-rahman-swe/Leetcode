// Last updated: 10/20/2025, 11:43:21 AM
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean emptyLeftPloat = (i == 0) || (flowerbed[i-1] == 0);
                boolean emptyRightPloat = (i == flowerbed.length - 1) || (flowerbed[i+1] == 0);

                if (emptyLeftPloat && emptyRightPloat) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count >= n;
    }
}