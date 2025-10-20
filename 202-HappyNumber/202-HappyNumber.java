// Last updated: 10/20/2025, 11:45:40 AM
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        int sum = 0;
        while (n != 1) {
            sum = 0;
            while (n > 0) {
                int x = n % 10;
                sum += x * x;
                n /= 10;
            }
            if (set.contains(sum)) return false;
            else set.add(sum);
            n = sum;
        }
        return true;
    }
}