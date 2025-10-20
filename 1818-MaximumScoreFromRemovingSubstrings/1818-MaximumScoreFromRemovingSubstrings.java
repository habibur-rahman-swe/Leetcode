// Last updated: 10/20/2025, 11:37:51 AM
class Solution {
    public int maximumGain(String s, int x, int y) {
        int aCount = 0, bCount = 0, res = 0;

        for (char c : s.toCharArray()) {
            if (c == 'a') {
                ++aCount;
                if (y >= x && bCount > 0) {
                    res += y;
                    --aCount;
                    --bCount;
                }
            } else if (c == 'b') {
                ++bCount;
                if (x >= y && aCount > 0) {
                    res += x;
                    --aCount;
                    --bCount;
                }
            } else {  
                res += Math.min(aCount, bCount) * Math.min(x, y); 
                aCount = bCount = 0;
            }
        }
        res += Math.min(aCount, bCount) * Math.min(x, y);
        return res;
    }
}