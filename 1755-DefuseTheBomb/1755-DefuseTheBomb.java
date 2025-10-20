// Last updated: 10/20/2025, 11:38:11 AM
class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];

        for (int i = 0; i < code.length; i++) {
            res[i] = getRes(i, code, k);
        }
        return res;
    }
    private int getRes(int idx, int[] code, int k) {
        int sum = 0;
        if (k > 0) {
            for (int j = 0; j < k; j++) {
                sum += code[(idx + j + 1) % code.length];
            }
        } else if (k < 0) {
            for (int j = 0; j < -1 * k; j++) {
                sum += code[(idx - j - 1 + code.length) % code.length];
            }
        }
        return sum;
    }
}