// Last updated: 10/20/2025, 11:38:46 AM
class Solution {
    public boolean isPathCrossing(String path) {
        boolean[][] dp = new boolean[2002][2002];
        int x = 1000, y = 1000;
        dp[x][y] = true; 
        for (char c : path.toCharArray()) {
            switch(c) {
                case 'N': ++y; break;
                case 'S': --y; break;
                case 'E': ++x; break;
                case 'W': --x; break;
            }
            if (dp[x][y]) return true;
            dp[x][y] = true;
        }
        return false;
    }
}