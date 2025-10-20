// Last updated: 10/20/2025, 11:34:29 AM
class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> hs = new HashSet<>();
        for (int x : banned) {
            hs.add(x);
        }
        int num = 1;
        int cnt = 0;
        while (maxSum - num >= 0 && num <= n) {
            if (!hs.contains(num)) {
                ++cnt;
                maxSum -= num;
            }
            ++num;
        }
        return cnt;
    }
}