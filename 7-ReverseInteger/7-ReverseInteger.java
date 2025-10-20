// Last updated: 10/20/2025, 11:49:10 AM

class Solution {
    public int reverse(int x) {
        long n = (long)x;

        long temp = 1;

        if (n < 0) temp = -1;

        long ans = 0, vf = n * temp;

        while (vf != 0) {
            ans = ans * 10 + (vf % 10);
            vf /= 10;
        }
        ans = ans * temp;
        long y = (long)Math.pow(2,31);
        if (ans >= -y && ans <= (y - 1)) return (int)ans;
        else return 0;
    }
}