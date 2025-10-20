// Last updated: 10/20/2025, 11:34:28 AM
class Solution {
    public int passThePillow(int n, int time) {
        int[] arr = new int[time+2];
        for (int i = 0, j = 1, x = 0; i <= time; i++) {
            x += j;
            arr[i] = x;
            if (i != 0 && x == n) j = -1;
            if (i != 0 && x == 1) j = 1;
        }
        return arr[time];
    }
}