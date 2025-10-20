// Last updated: 10/20/2025, 11:33:29 AM
class Solution {
    public int minimumSum(int n, int k) {
        HashSet<Integer> set = new HashSet<>();
        int x = 1;
        while (set.size() < n) {
            if (!set.contains(k - x)) {
                set.add(x);
            }
            ++x;
        }
        int sum = 0;
        for (int y : set) {
            sum += y;
        }
        return sum;
    }
}