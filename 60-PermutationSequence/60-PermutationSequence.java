// Last updated: 10/20/2025, 11:47:54 AM
class Solution {
    public String getPermutation(int n, int k) {
        StringBuilder ans = new StringBuilder();
        int fact = 1;
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            nums.add(i);
            fact *= i;
        }
        nums.add(n);

        k -= 1;

        while (nums.size() > 0) {
            ans.append(nums.get(k / fact));
            nums.remove(k / fact);
            k %= fact;
            fact /= Math.max(nums.size(), 1);
        }
        return new String(ans);
    }
}