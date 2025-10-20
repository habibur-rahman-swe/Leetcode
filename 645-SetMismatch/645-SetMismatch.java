// Last updated: 10/20/2025, 11:42:59 AM
class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] a = new int[n+1];
        for (int x : nums) a[x]++;
        int[] res = new int[2];
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if (a[i] == 2) res[0] = i;
            if (a[i] == 0) res[1] = i;
        }
        return res;
    }
}