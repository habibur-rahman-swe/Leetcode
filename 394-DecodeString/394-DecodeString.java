// Last updated: 10/20/2025, 11:44:16 AM
class Solution {
    public String decodeString(String s) {
        StringBuilder res = new StringBuilder();
        Stack<StringBuilder> stackStr = new Stack<>();
        Stack<Integer> stackNum = new Stack<>();
        int num = 0;

        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                num = num * 10 + c - '0';
            } else if (c == '[') {
                stackStr.push(res);
                res = new StringBuilder();
                stackNum.push(num);
                num = 0;
            } else if (c == ']') {
                StringBuilder temp = res;
                res = stackStr.pop();
                int count = stackNum.pop();
                while (count-- > 0) {
                    res.append(temp);
                }
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }
}