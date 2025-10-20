// Last updated: 10/20/2025, 11:46:26 AM
class Solution {
    public int minCut(String s) {
        int n = s.length();
        char[] c = s.toCharArray();

        boolean[][] palindrome = new boolean[n][n];
        int[] cuts = new int[n];

        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = 0; j <= i; j++) {
                if (c[i] == c[j] && (j + 1 > i - 1 || palindrome[j + 1][i - 1])) {
                    palindrome[j][i] = true;
                    min = j == 0 ? 0 : Math.min(cuts[j-1] + 1, min);
                }
            }
            cuts[i] = min;
        }
        for (int x : cuts) System.out.print(x + " ");
        return cuts[n-1];
    }
}