// Last updated: 10/20/2025, 11:48:24 AM
class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String r = countAndSay(n-1);
        String s = "";
        int cnt = 0;

        Stack<Character> st = new Stack<>();

        for (char c : r.toCharArray()) {
            if (st.isEmpty() || st.peek() == c) {
                st.push(c);
            } else {
                char x = st.peek();
                int len = st.size();
                st.clear();

                s = s + String.valueOf(len) + x;
                st.push(c);
            }
        }

        if (!st.isEmpty()) {
            char x = st.peek();
            int len = st.size();
            st.clear();

            s = s + String.valueOf(len) + x;
        }

        return s;
    }
}