// Last updated: 10/20/2025, 11:42:36 AM
class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n = arr.length;
        int[] answer = new int[n];
        int[] lastIdx = new int[101];

        for (int i = n - 1; i >= 0; i--) {
            int idx = Integer.MAX_VALUE;
            for (int j = arr[i] + 1; j <= 100; j++) {
                if (lastIdx[j] > 0) idx = Math.min(idx, lastIdx[j]);
            }
            answer[i] = idx == Integer.MAX_VALUE ? 0 : idx - i;
            lastIdx[arr[i]] = i;
        }
        return answer;
    }
}