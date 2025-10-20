// Last updated: 10/20/2025, 11:33:34 AM
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int n = derived.length;
        if (n == 1) return derived[0] == 0;
        
        int[] original = new int[n];
        
        original[n-1] = 0;
        
        for (int i = n - 2; i >= 0; i--) {
            if (derived[i] == 0) {
                original[i] = original[i+1];
            } else {
                original[i] = (original[i+1] + 1) % 2;
            }
        }
        
        int[] der = new int[n];
        for (int i = 0; i < n; i++) {
            if (derived[i] != (original[i] ^ original[(i + 1) % n])) return false;
        }
        return true;
    }
}