// Last updated: 10/20/2025, 11:40:02 AM
class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int n = plants.length;
        int ans = 0, temp = capacity;
        for (int i = 0; i < n; i++) {
            if (temp - plants[i] >= 0) {
                temp -= plants[i];
                ++ans;
            } else {
                temp = capacity;
                ans += 2*i + 1;
                temp -= plants[i];
            }
        }
        return ans;
    }
}