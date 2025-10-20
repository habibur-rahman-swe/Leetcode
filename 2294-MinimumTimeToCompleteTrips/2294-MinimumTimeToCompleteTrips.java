// Last updated: 10/20/2025, 11:36:10 AM
class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long maxTime = 0;

        for (int x : time) {
            maxTime = Math.max(x, maxTime);
        }

        long left = 0, right = maxTime * totalTrips;
        
        while (left < right) {
            long mid = left + (right - left) / 2;
            long temp = 0;
            for (int x : time) {
                temp += mid / x;
            }

            if (totalTrips <= temp) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
}