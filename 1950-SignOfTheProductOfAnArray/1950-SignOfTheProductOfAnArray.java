// Last updated: 10/20/2025, 11:37:15 AM
class Solution {
    public int arraySign(int[] nums) {
        boolean zero = false;
        int neg = 0;
        for (int x : nums) {
            if (x < 0) ++neg;
            else if (x == 0) zero = true;
        }

        if (zero) return 0;
        return neg % 2 == 0 ? 1 : -1;
    }
}