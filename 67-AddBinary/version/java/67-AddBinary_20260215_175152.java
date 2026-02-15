// Last updated: 2/15/2026, 5:51:52 PM
1class Solution {
2    public String addBinary(String a, String b) {
3        char[] s1 = a.toCharArray();
4        char[] s2 = b.toCharArray();
5        String res = "";
6        int len1 = a.length();
7        int len2 = b.length();
8        int carry = 0;
9        while (len1 > 0 && len2 > 0) {
10            int temp = s1[len1-1] - '0' + s2[len2-1] - '0' + carry;
11            if (temp == 0) {
12                res = '0' + res;
13                carry = 0;
14            } else if (temp == 1) {
15                res = '1' + res;
16                carry = 0;
17            } else if (temp == 2){
18                res = '0' + res;
19                carry = 1;
20            } else {
21                res = '1' + res;
22                carry = 1;
23            }
24            --len1;
25            --len2;
26        }
27        while (len1 > 0) {
28            if (s1[len1-1]+carry == '1') {
29                res = '1' + res;
30                carry = 0;
31            } else if (s1[len1-1]+carry == '0') {
32                res = '0' + res;
33                carry = 0;
34            } else if (s1[len1-1]+carry == '2'){
35                res = '0' + res;
36                carry = 1;
37            } else {
38                res = '1' + res;
39                carry = 1;
40            }
41            len1--;
42        }
43        while (len2 > 0) {
44            if (s2[len2-1]+carry == '1') {
45                res = '1' + res;
46                carry = 0;
47            } else if (s2[len2-1]+carry == '0') {
48                res = '0' + res;
49                carry = 0;
50            } else if (s2[len2-1]+carry == '2'){
51                res = '0' + res;
52                carry = 1;
53            } else {
54                res = '1' + res;
55                carry = 1;
56            }
57            len2--;
58        }
59        if (carry == 1) res = '1' + res;
60        
61        return res;
62    }
63}