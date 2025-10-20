// Last updated: 10/20/2025, 11:42:11 AM
class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();

        backtrack(res, new StringBuilder(""), s, 0);

        return res;
    }

    private void backtrack(List<String> res, StringBuilder sb, String str, int pos) {
        if (sb.length() == str.length()) {
            res.add(new String(sb));
            return;
        }
        char ch = str.charAt(pos);
        if (Character.isLetter(str.charAt(pos))) {
            sb.append(Character.toLowerCase(ch));
            backtrack(res, sb, str, pos + 1);
            sb.deleteCharAt(sb.length() - 1);
            sb.append(Character.toUpperCase(ch));
            backtrack(res, sb, str, pos + 1);
            sb.deleteCharAt(sb.length() - 1);
        } else {
            sb.append(ch);
            backtrack(res, sb, str, pos + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}