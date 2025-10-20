// Last updated: 10/20/2025, 11:41:31 AM
class Solution {
    public int sumSubarrayMins(int[] arr) {
        int len = arr.length;

        int[] dp = new int[len];

        int  mod = 1000000007;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                dp[i] = (dp[stack.peek()] + (i - stack.peek()) * arr[i]) % mod;
            } else {
                dp[i] = ((i+1) * arr[i]) % mod;
            }
            stack.push(i);
        }

        for (int i = 1; i < len; i++) {
            dp[i] = (dp[i] + dp[i-1]) % mod;
        }

        return dp[len - 1];
    }
}