// Last updated: 10/20/2025, 11:40:45 AM
class Solution {
    boolean feasible(int[] weights, int maxLoad, int days) {
        int currentLoad = 0, dayNeeds = 1;

        for (int weight : weights) {
            currentLoad += weight;
            if (currentLoad > maxLoad) {
                currentLoad = weight;
                dayNeeds++;
            }
        }

        return dayNeeds <= days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int maxLoad = 0, totalLoad = 0;

        for (int weight : weights) {
            totalLoad += weight;
            maxLoad = Math.max(maxLoad, weight);
        }

        int l = maxLoad, r = totalLoad;

        while (l < r) {
            int mid = l + (r - l) / 2;
            if (feasible(weights, mid, days)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}