// Last updated: 10/20/2025, 11:37:19 AM
class Solution {
    public int countNicePairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int rev = rev(num);
            map.put(num - rev, map.getOrDefault(num - rev, 0) + 1);
        }

        long ans = 0;
        long mod = 1000000007;

        for (int x : map.keySet()) {
            ans += (long)map.get(x) * (map.get(x) - 1) / 2;
            ans %= mod;
        }
        return (int)ans;
    }

    private int rev(int num) {
        int reverse = 0;
        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        return reverse;
    }
}