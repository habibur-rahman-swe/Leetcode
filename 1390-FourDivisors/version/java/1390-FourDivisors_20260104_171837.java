// Last updated: 1/4/2026, 5:18:37 PM
1class Solution {
2    public int sumFourDivisors(int[] nums) {
3        int res = 0;
4        for (int num : nums) {
5            int temp = sumOne(num);
6            if (temp != -1) {
7                res += temp;
8            }
9        }
10        return res;
11    }
12
13    private int sumOne(int n) {
14        int p = (int) Math.round(Math.cbrt(n));
15        if ((long)p * p * p == n && isPrime(p)) {
16            return 1 + p + p * p + p * p * p;
17        }
18
19        for (int i = 2; i * i <= n; i++) {
20            if (n % i == 0) {
21                int a = i;
22                int b = n / i;
23                if (a != b && isPrime(a) && isPrime(b)) {
24                    return 1 + a + b + n;
25                }
26                return -1;
27            }
28        }
29        return -1;
30    }
31
32    private boolean isPrime(int x) {
33        if (x < 2) return false;
34        for (int i = 2; i * i <= x; i++) {
35            if (x % i == 0) return false;
36        }
37        return true;
38    }
39}