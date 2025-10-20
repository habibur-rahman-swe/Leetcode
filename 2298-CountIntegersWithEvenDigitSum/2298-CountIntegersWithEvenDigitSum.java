// Last updated: 10/20/2025, 11:36:08 AM
class Solution {
    public int countEven(int num) {
        int n, cnt = 0, digitSum = 0;
        for (int i = 1; i <= num; i++) {
            digitSum = 0;
            n = i;
            while (n > 0) {
                digitSum += n % 10;
                n /= 10;
            }
            if (digitSum % 2 == 0) ++cnt;
        }
        return cnt;
    }
}