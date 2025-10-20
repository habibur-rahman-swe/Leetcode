// Last updated: 10/20/2025, 11:36:13 AM
class Solution {
    public List<Long> maximumEvenSplit(long n) {
        List<Long> res = new ArrayList<>();
        if (n % 2 == 1) return res;
        long x = 2;
        while (n - x > x) {
            res.add(x);
            n -= x;
            x += 2;
        }
        res.add(n);
        return res;
    }
}