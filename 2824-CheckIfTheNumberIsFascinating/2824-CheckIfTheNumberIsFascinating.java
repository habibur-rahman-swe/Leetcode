// Last updated: 10/20/2025, 11:33:24 AM
class Solution {
    public boolean isFascinating(int n) {
        int[] arr = new int[10];
        for (int i = 1; i <= 3; i++) {
            calculateDigits(i * n, arr);
        }
        
        if (arr[0] > 0) return false;
        for (int i = 1; i <= 9; i++) if (arr[i] != 1) return false;
        return true;
    }
    
    private void calculateDigits(int x, int[] arr) {
        while (x > 0) {
            arr[x % 10]++;
            x /= 10;
        }
    }
}