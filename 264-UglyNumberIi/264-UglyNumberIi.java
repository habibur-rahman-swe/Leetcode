// Last updated: 10/20/2025, 11:45:05 AM
class Solution {
    public int nthUglyNumber(int n) {
        TreeSet<Long> ts = new TreeSet<>();

        long uglyNumber = 1;
        ts.add(1L);

        for (int i = 1; i <= n; i++) {
            uglyNumber = ts.pollFirst();

            ts.add(2 * uglyNumber);
            ts.add(3 * uglyNumber);
            ts.add(5 * uglyNumber);
        }

        return (int)uglyNumber;
    }
}