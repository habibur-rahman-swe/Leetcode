// Last updated: 10/20/2025, 11:48:46 AM
class Solution {
    private List<String> res;
    private int n;
    public List<String> generateParenthesis(int n) {
        this.n = n;
        res = new ArrayList<>();

        getAns("", 0, 0);

        return res;
    }

    private void getAns(String s, int open, int close) {
        if (open + close == 2 * n) {
            res.add(s);
            return;
        }

        if (open < n) getAns(s + "(", open + 1, close);
        if (close < open) getAns(s + ")", open, close + 1);
    }
}