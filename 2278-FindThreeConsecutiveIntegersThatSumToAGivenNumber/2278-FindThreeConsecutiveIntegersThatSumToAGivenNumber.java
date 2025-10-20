// Last updated: 10/20/2025, 11:36:15 AM
class Solution {
    public long[] sumOfThree(long num) {
        long[] arr = {};
        if (num % 3 == 0) {
            arr = new long[3];
            arr[0] = num / 3 - 1;
            arr[1] = num / 3;
            arr[2] = num / 3 + 1;
        }
        return arr;
    }
}