// Last updated: 10/20/2025, 11:34:49 AM
class Solution {
    public int smallestValue(int n) {

        while (true) {
            int temp = n;
            int pSum = getPrimeFactorSum(temp);
            if (temp == pSum) break;
            else n = pSum;
        }
        
        return n;
    }

    private int getPrimeFactorSum(int num) {
        int sum = 0;
        int i = 2;
        while (i * i <= num) {
            while (num % i == 0) {
                sum += i;
                num /= i;
            }
            if (i == 2) ++i;
            else i += 2;
        }
        return (num == 1 ? sum : num + sum);
    }
}