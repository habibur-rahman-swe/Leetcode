// Last updated: 10/20/2025, 11:35:35 AM
class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] a = new int[101];
        for (int x : nums) a[x]++;
        
        int f = 0, s = 0;
        for (int x : a) {
            f += x / 2;
            s += x % 2;
        }
        
        return new int[] {f, s};
    }
}