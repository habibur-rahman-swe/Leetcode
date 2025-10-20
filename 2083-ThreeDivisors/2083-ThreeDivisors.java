// Last updated: 10/20/2025, 11:37:02 AM
class Solution {
    public boolean isThree(int n) {
        int div = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) ++div;
        }
        if (div == 2) return true;
        else return false;
    }
}