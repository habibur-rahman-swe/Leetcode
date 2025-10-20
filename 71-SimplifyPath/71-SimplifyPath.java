// Last updated: 10/20/2025, 11:47:38 AM
class Solution {
    public String simplifyPath(String path) {
        String s[] = path.split("/");
        Stack<String> st = new Stack<>();

        for (String x : s) {
            if (x.compareTo(".") == 0 || x.length() == 0) continue;
            else if (x.compareTo("..") == 0) {
                if (!st.isEmpty()) st.pop();
            } else {
                st.push(x);
            }
        }

        StringBuilder res = new StringBuilder("");

        while (!st.isEmpty()) {
            res.insert(0, "/" + st.pop());
        }
        if (res.length() == 0) res.append("/");
        return new String(res);
    }
}