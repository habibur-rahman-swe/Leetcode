// Last updated: 10/20/2025, 11:43:57 AM
class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int max = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < max) return true;
            while (!stack.isEmpty() && stack.peek() < nums[i]) {
                max = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
}