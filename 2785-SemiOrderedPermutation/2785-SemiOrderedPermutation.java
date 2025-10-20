// Last updated: 10/20/2025, 11:33:38 AM
class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int n = nums.length;
        
        int idx_one = 0, idx_n = n;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                idx_one = i;
            }
            if (nums[i] == n) {
                idx_n = i;
            }
        }
        
        int ans = idx_one + n - idx_n - 1;
        if (idx_one > idx_n) ans -= 1;
        System.out.println(idx_one + " " + idx_n);
        return ans;
    }
}