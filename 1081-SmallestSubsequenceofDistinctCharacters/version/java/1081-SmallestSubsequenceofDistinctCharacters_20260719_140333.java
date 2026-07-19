// Last updated: 7/19/2026, 2:03:33 PM
1class Solution {
2    public String smallestSubsequence(String s) {
3        int[] freq = new int[26];
4        boolean[] seen = new boolean[26];
5        Stack<Character> stack = new Stack<>();
6        
7        for (char c : s.toCharArray()) {
8            freq[c - 'a']++;
9        }
10
11        for (char curr : s.toCharArray()) {
12            freq[curr - 'a']--;
13
14            if (seen[curr - 'a']) continue;
15            
16            while (!stack.isEmpty()) {
17                if (stack.peek() <= curr) {
18                    break;
19                }
20
21                if (freq[stack.peek() - 'a'] == 0) {
22                    break;
23                }
24
25                seen[stack.peek() - 'a'] = false;
26                stack.pop();
27            }
28
29            stack.push(curr);
30            seen[curr - 'a'] = true;
31        }
32
33        StringBuilder res = new StringBuilder("");
34        for (char c : stack) {
35            res.append(c);
36        }
37        return res.toString();
38    }
39}