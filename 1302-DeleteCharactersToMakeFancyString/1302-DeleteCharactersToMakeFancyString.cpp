// Last updated: 10/20/2025, 11:40:09 AM
class Solution {
public:
    string makeFancyString(string s) {
        string res = "";
        res += s[0];
        int x = 0;
        for (int i = 1; i < s.size(); i++) {
            if (s[i] == s[i-1]) {
                ++x;
                if (x < 2) res += s[i];
                else continue;
            } else {
                x = 0;
                res += s[i];
            }
        }
        return res;
    }
};