// Last updated: 10/20/2025, 11:33:21 AM
class Solution {
    public String smallestString(String s) {
        char[] str = s.toCharArray();
        boolean flag = false;
        int n = str.length;
        for (int i = 0; i < n; i++) {
            if (str[i] > 'a') {
                flag = true;
                int idx = i;
                while (idx < n && str[idx] > 'a') {
                    str[idx] = (char)(str[idx] - 1);
                    idx++;
                }
                break;
            }
        }
        if (!flag) {
            str[n-1] = 'z';
        }
        
        return String.valueOf(str);
    }
}