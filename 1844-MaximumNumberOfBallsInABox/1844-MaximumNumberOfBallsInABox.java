// Last updated: 10/20/2025, 11:37:44 AM
class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] arr = new int[46];
        int max = 0;
        for (int i = lowLimit; i <= highLimit; i++) {
            int sum = 0;
            int temp = i;
            while(temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            arr[sum]++;
            max = Math.max(arr[sum], max);
        }
        return max;
    }
}