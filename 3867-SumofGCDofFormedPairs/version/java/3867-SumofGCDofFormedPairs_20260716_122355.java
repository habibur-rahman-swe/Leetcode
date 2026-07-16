// Last updated: 7/16/2026, 12:23:55 PM
1class Solution {
2    public long gcdSum(int[] nums) {
3        int[] prefixGcd = new int[nums.length];
4        int max = 0;
5
6        for (int i = 0; i < nums.length; i++) {
7            max = Math.max(nums[i], max);
8            prefixGcd[i] = gcd(max, nums[i]);
9        }
10        Arrays.sort(prefixGcd);
11        long ans = 0;
12        int left = 0;
13        int right = nums.length - 1;
14        while (left < right) {
15            ans += gcd(prefixGcd[left], prefixGcd[right]);
16            left++;
17            right--;
18        }
19        return ans;
20    }
21    
22    private int gcd(int a, int b) {
23        return b == 0 ? a : gcd(b, a % b);
24    }
25}