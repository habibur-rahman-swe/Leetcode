// Last updated: 10/20/2025, 11:34:36 AM
class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, (a, b) -> (b[k] - a[k]));
        return score;
    }
}