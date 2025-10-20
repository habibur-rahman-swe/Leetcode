// Last updated: 10/20/2025, 11:37:31 AM
class Solution {
    public int countHomogenous(String s) {
        long mod = (long)1E9 + 7;
        long ans = 0, cnt = 0;
        char prev = s.charAt(0);

        for (char c : s.toCharArray()) {
            if (c == prev) ++cnt;
            else {
                ans += cnt * (cnt + 1) / 2;
                ans %= mod;
                cnt = 1;
            }
            prev = c;
        }
       

        ans += (cnt * (cnt + 1)) / 2;
        ans %= mod;

        return (int)ans;
    }
}