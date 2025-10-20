// Last updated: 10/20/2025, 11:42:37 AM
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int x : asteroids) {
            if (stack.isEmpty() || stack.peek() < 0 && x > 0 || stack.peek() < 0 && x < 0 || stack.peek() > 0 && x > 0) {
                stack.push(x);
            } else {
                if (stack.peek() == Math.abs(x)) {
                    stack.pop();
                } else {
                    if (stack.peek() > Math.abs(x)) {
                        continue;
                    } else {
                        while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(x)) {
                            stack.pop();
                        } 
                        if (!stack.isEmpty() && stack.peek() == -1 * x) {
                            stack.pop();
                        }
                        else if (stack.isEmpty() || stack.peek() < 0) {
                            stack.push(x);
                        }
                    }
                }
            } 
        }

        int[] arr = new int[stack.size()];
        int n = stack.size();
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = stack.pop();
        }
        return arr;
    }
}