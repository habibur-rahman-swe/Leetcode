// Last updated: 10/20/2025, 11:37:58 AM
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] arr = new int[2];
        for (int s : students) {
            arr[s]++;
        }
        for (int sand : sandwiches) {
            if (arr[sand] == 0) return arr[0] + arr[1];
            arr[sand]--;
        }
        return 0;
    }
}