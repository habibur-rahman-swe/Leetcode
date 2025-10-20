// Last updated: 10/20/2025, 11:39:38 AM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0, product = 1;
        while (n != 0) {
            sum += n % 10;
            product *= n % 10;
            n /= 10;
        }
        return product - sum;
    }
}