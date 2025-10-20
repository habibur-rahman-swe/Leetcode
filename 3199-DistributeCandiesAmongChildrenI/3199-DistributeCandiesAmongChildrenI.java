// Last updated: 10/20/2025, 11:32:25 AM
class Solution {
    public int distributeCandies(int n, int limit) {
        if (n % 3 == 0 && n / 3 == limit) return 1;
        if (n / 3 >= limit) return 0;
        
        int cnt = 0;
        for (int i = 0; i <= limit; i++) {
            for (int j = 0; j <= limit; j++) {
                if (n - i - j >= 0 && n - i - j <= limit) ++cnt;
            }
        }
        return cnt;
    }
}