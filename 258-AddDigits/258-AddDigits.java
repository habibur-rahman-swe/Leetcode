// Last updated: 10/20/2025, 11:45:08 AM
class Solution {
    public int addDigits(int num) {
        int sum = 0;
        if (num > 9) {
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return (num <= 9 ? num : addDigits(num));
    }
}