// Last updated: 10/20/2025, 11:33:13 AM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int cnt = 0;
        for (int x : hours) {
            if (x >= target) {
                ++cnt;
            }
        }
        return cnt;
    }
}