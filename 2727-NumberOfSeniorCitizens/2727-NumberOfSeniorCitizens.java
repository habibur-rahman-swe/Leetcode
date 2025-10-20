// Last updated: 10/20/2025, 11:33:48 AM
class Solution {
    public int countSeniors(String[] details) {
        int cnt = 0;
        for (String detail : details) {
            // System.out.println(detail.charAt(11) + " " + detail.charAt(12));
            if ((detail.charAt(11) - '0') * 10 + (detail.charAt(12) - '0') > 60) ++cnt;
        }
        return cnt;
    }
}