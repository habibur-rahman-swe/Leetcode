// Last updated: 10/20/2025, 11:33:35 AM
class Solution {
    public int[] circularGameLosers(int n, int k) {
        int x = 1, i = 1;
        Set<Integer> set = new HashSet<>();
        
        while (!set.contains(x)) {
            set.add(x);
            x = (x + i * k);
            if (x % n == 0) x = n;
            else x %= n;
            i++;
        }
        
        int[] arr = new int[n - set.size()];
        int idx = 0;
        for (i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                arr[idx] = i;
                idx++;
            }
        }
        return arr;
    }
}