// Last updated: 10/20/2025, 11:37:45 AM
class Solution {
    public int[] decode(int[] encoded) {
        int first = 0;
        int n = encoded.length + 1;
        for (int i = 1; i <= n; i++) {
            first ^= i;
            if (i < n - 1 && i % 2 == 1) first ^= encoded[i];
        }
        int[] perm = new int[n];
        for (int i = 0; i < n; i++) {
            perm[i] = i == 0 ? first : encoded[i-1] ^ perm[i-1];
        }
        return perm;
    }
}