// Last updated: 10/20/2025, 11:42:54 AM
class Solution {
    public int maximumSwap(int num) {
        int numLen = String.valueOf(num).length();
        int[] arr = new int[numLen];
        int[] rightMax = new int[numLen];

        for (int i = numLen - 1; i >= 0; i--) {
            arr[i] = num % 10;
            rightMax[i] = i == numLen - 1 ? arr[i] : Math.max(arr[i], rightMax[i + 1]);
            num /= 10;
        }

        int left = 0, right = numLen - 1;

        while (left < right) {
            if (arr[left] == rightMax[left]) {
                left++;
                continue;
            } else if (rightMax[left] == arr[right]) {
                arr[right] = arr[left];
                arr[left] = rightMax[left];
                break;
            }
            right--;
        }

        for (int i = 0; i < numLen; i++) {
            num = num * 10 + arr[i];
        }

        return num;
    }
}