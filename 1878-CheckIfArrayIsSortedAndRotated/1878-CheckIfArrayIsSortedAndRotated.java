// Last updated: 10/20/2025, 11:37:34 AM
class Solution {
    public boolean check(int[] a1) {
        int n = a1.length;
        
        int[] a2 = new int[2*n];
        for (int i = 0; i < n; i++) {
            a2[i] = a2[i+n] = a1[i];
        }
        Arrays.sort(a1);
        boolean ans = false;
        for (int i = 0; i < n; i++) {
            ans = true;
            for (int j = 0; j < n; j++) {
                if (a1[j] == a2[j+i]) {
                    continue;
                }
                else {
                    ans = false;
                    break;
                }
            }
            if (ans) {
                return true;
            }
        }

        return false;
    }
}