// Last updated: 10/20/2025, 11:36:02 AM
class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n = nums.length;
        int[] l = new int[n];
        int[] r = new int[n];
        
        l[0] = 100000;
        for (int i = 0; i < n; i++) {
            if (nums[i] == key) l[i] = i;
            else if (i > 0) l[i] = l[i-1];
        }
        r[n-1] = 100000;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] == key) r[i] = i;
            else if (i < n - 1) r[i] = r[i+1];
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (Math.abs(l[i] - i) <= k || Math.abs(r[i] - i) <= k) res.add(i);
        }
        return res;
    }
}