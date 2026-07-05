// Last updated: 7/5/2026, 2:31:33 PM
1class Solution {
2    public boolean canMakeSubsequence(String source, String target) {
3        int sourceLength = source.length();
4        int targetLength = target.length();
5
6        if (sourceLength > targetLength) {
7            return false;
8        }
9
10        int[] leftMatchIndex = new int[sourceLength];
11        int targetPointer = 0;
12
13        for (int sourcePointer = 0; sourcePointer < sourceLength; sourcePointer++) {
14            while (targetPointer < targetLength && 
15                  target.charAt(targetPointer) != source.charAt(sourcePointer)) {
16                targetPointer++;
17            }
18            leftMatchIndex[sourcePointer] = targetPointer;
19
20            if (targetPointer < targetLength) {
21                targetPointer++;
22            }
23        }
24
25        if (leftMatchIndex[sourceLength - 1] < targetLength) {
26            return true;
27        }
28
29        int[] rightMatchIndex = new int[sourceLength];
30        targetPointer = targetLength - 1;
31        for (int sourcePointer = sourceLength - 1; sourcePointer >= 0; sourcePointer--) {
32            while(targetPointer >= 0 && target.charAt(targetPointer) != source.charAt(sourcePointer)) {
33                targetPointer--;
34            }
35            rightMatchIndex[sourcePointer] = targetPointer;
36            if (targetPointer >= 0) {
37                targetPointer--;
38            }
39        }
40
41        for (int removeIndex = 0; removeIndex < sourceLength; removeIndex++) {
42            int prevMatchIndex = (removeIndex == 0) ? -1 : leftMatchIndex[removeIndex - 1];
43            int nextMatchIndex = (removeIndex == sourceLength - 1) ? targetLength : rightMatchIndex[removeIndex + 1];
44
45            if (prevMatchIndex < targetLength && nextMatchIndex >= 0 && nextMatchIndex - prevMatchIndex >= 2) {
46                return true;
47            }
48        }
49        return false;
50    }
51}