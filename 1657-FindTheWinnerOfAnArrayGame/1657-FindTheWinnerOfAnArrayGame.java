// Last updated: 10/20/2025, 11:38:33 AM
class Solution {
    public int getWinner(int[] arr, int k) {
        int left = 0, right = 1;
        int leftCnt = 0, rightCnt = 0;

        while(right < arr.length) {
            if (arr[left] > arr[right]) {
                leftCnt++;
                right++;
                rightCnt = 0;
            }  else {
                left = right;
                leftCnt = rightCnt + 1;
                right++;
                rightCnt = 0;
            }
            if (leftCnt >= k) break;
        }
        return arr[left];
    }
}