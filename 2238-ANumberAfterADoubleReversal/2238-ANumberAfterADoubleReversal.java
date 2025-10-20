// Last updated: 10/20/2025, 11:36:27 AM
class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev1 = reverse(num);
        int rev2 = reverse(rev1);
        
        return (num == rev2 ? true : false);
    }
    public int reverse(int n) {
        int rev = 0;
        int temp = n;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev;
    }
}