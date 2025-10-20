// Last updated: 10/20/2025, 11:48:49 AM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                st.push(c);
            } else if (!st.isEmpty() && c == ')' && st.peek() == '(') {
                st.pop();
            } else if (!st.isEmpty() && c == '}' && st.peek() == '{') {
                st.pop();
            } else if (!st.isEmpty() && c == ']' && st.peek() == '[') {
                st.pop();
            } else {
                return false;
            }
        }
        return st.isEmpty();
    }
}