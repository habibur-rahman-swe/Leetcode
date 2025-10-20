// Last updated: 10/20/2025, 11:38:29 AM
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j+=2) {
                for (int k = i; k <= j; k++) sum += arr[k];
            }
        }
        return sum;
    }
}