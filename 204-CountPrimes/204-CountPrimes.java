// Last updated: 10/20/2025, 11:45:38 AM
class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;
        boolean[] isPrimes = new boolean[n+1];
        Arrays.fill(isPrimes, true);
        
        isPrimes[0] = isPrimes[1] = false;
        
        for (int i = 2; i * i <= n; i++) {
            if (isPrimes[i] == true) {
                for (int j = 2 * i; j <= n; j += i) isPrimes[j] = false;
            }
        }
        
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrimes[i]) ++count;
        }
        return count;
    }
}