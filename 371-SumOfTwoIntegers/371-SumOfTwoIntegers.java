// Last updated: 10/20/2025, 11:44:30 AM
class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int x = a ^ b;
            int y = (a & b) << 1;
            a = x;
            b = y;
        }
        return a;
    }
}