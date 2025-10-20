// Last updated: 10/20/2025, 11:37:23 AM
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        int left = 0, right = s1.length() - 1;
        int cnt = 1;
        while (left <= right) {
            if (str1[left] == str2[left]) ++left;
            else if (str1[right] == str2[right]) --right;
            else {
                if (str1[left] == str2[right] && str1[right] == str2[left] && cnt > 0) {
                    ++left;
                    --right;
                    --cnt;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}