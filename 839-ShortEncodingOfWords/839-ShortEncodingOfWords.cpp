// Last updated: 10/20/2025, 11:42:02 AM
class Solution {
public:
    int minimumLengthEncoding(vector<string>& words) {
        unordered_set<string> s(words.begin(), words.end());
        for (string w : s) {
            for (int i = 1; i < w.size(); ++i) {
                s.erase(w.substr(i));
            }
        }
        int res = 0;
        for (string w : s) res += w.size() + 1;
        return res;
    }
};