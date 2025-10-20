// Last updated: 10/20/2025, 11:35:11 AM
class Solution {
    public int minimumPartition(String s, int k) {
        long currNum = 0, prevNum = 0;
        int ans = 0;

        for (char c : s.toCharArray()) {
            currNum = currNum * 10 + c - '0';
            if (currNum <= k) continue;
            if (currNum > k) {
                if (prevNum > k) return -1;
                ++ans;
                currNum = c - '0';
            }
            prevNum = currNum;
        }
        if (prevNum > k) return -1;
        else return (ans + 1);
    }
}