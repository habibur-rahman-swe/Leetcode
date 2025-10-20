// Last updated: 10/20/2025, 11:46:11 AM
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numbers = new Stack<>();
        for (String token : tokens) {
            if (token.length() == 1 && !Character.isDigit(token.charAt(0))) {
                int second = numbers.pop();
                int first = numbers.pop();
                int res = operate(first, second, token.charAt(0));
                numbers.push(res);
            } else {
                numbers.push(Integer.parseInt(token));
            }
        }
        return numbers.pop();
    }
    private int operate(int first, int second, char op) {
        int res = 0;
        switch(op) {
            case '+' : res = first + second; break;
            case '-' : res = first - second; break;
            case '/' : res = first / second; break;
            case '*' : res = first * second; break;
            default : res = -1;
        }
        return res;
    }
}