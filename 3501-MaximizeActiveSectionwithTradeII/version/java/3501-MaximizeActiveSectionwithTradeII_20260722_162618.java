// Last updated: 7/22/2026, 4:26:18 PM
1class SegmentTree {
2
3    private int size;
4    private int[] values;
5    private int[] tree;
6
7    private void build(int node, int left, int right) {
8        if (left == right) {
9            tree[node] = values[left];
10            return;
11        }
12
13        int mid = (left + right) / 2;
14
15        build(node * 2, left, mid);
16        build(node * 2 + 1, mid + 1, right);
17
18        tree[node] = Math.max(tree[node * 2], tree[node * 2 + 1]);
19    }
20
21    private int queryTree(
22        int node,
23        int left,
24        int right,
25        int queryLeft,
26        int queryRight
27    ) {
28        if (queryLeft <= left && right <= queryRight) {
29            return tree[node];
30        }
31
32        int mid = (left + right) / 2;
33        int maxValue = 0;
34
35        if (queryLeft <= mid) {
36            maxValue = Math.max(
37                maxValue,
38                queryTree(node * 2, left, mid, queryLeft, queryRight)
39            );
40        }
41
42        if (queryRight > mid) {
43            maxValue = Math.max(
44                maxValue,
45                queryTree(node * 2 + 1, mid + 1, right, queryLeft, queryRight)
46            );
47        }
48
49        return maxValue;
50    }
51
52    public SegmentTree(int[] inputValues) {
53        values = inputValues;
54        size = inputValues.length;
55        tree = new int[size * 4];
56        build(1, 0, size - 1);
57    }
58
59    public int query(int queryLeft, int queryRight) {
60        if (queryLeft > queryRight) {
61            return 0;
62        }
63
64        return queryTree(1, 0, size - 1, queryLeft, queryRight);
65    }
66}
67
68class Solution {
69
70    public List<Integer> maxActiveSectionsAfterTrade(
71        String binaryString,
72        int[][] queries
73    ) {
74        int length = binaryString.length();
75        int totalOnes = 0;
76
77        for (char ch : binaryString.toCharArray()) {
78            if (ch == '1') {
79                totalOnes++;
80            }
81        }
82
83        List<Integer> zeroBlockLengths = new ArrayList<>();
84        List<Integer> zeroBlockStarts = new ArrayList<>();
85        List<Integer> zeroBlockEnds = new ArrayList<>();
86
87        int index = 0;
88
89        while (index < length) {
90            int blockStart = index;
91
92            while (
93                index < length &&
94                binaryString.charAt(index) == binaryString.charAt(blockStart)
95            ) {
96                index++;
97            }
98
99            if (binaryString.charAt(blockStart) == '0') {
100                zeroBlockLengths.add(index - blockStart);
101                zeroBlockStarts.add(blockStart);
102                zeroBlockEnds.add(index - 1);
103            }
104        }
105
106        int zeroBlockCount = zeroBlockLengths.size();
107
108        if (zeroBlockCount < 2) {
109            List<Integer> answer = new ArrayList<>();
110
111            for (int i = 0; i < queries.length; i++) {
112                answer.add(totalOnes);
113            }
114
115            return answer;
116        }
117
118        int[] adjacentZeroBlockSums = new int[zeroBlockCount - 1];
119
120        for (int i = 0; i < zeroBlockCount - 1; i++) {
121            adjacentZeroBlockSums[i] =
122                zeroBlockLengths.get(i) + zeroBlockLengths.get(i + 1);
123        }
124
125        SegmentTree segmentTree = new SegmentTree(adjacentZeroBlockSums);
126        List<Integer> answer = new ArrayList<>();
127
128        for (int[] query : queries) {
129            int left = query[0];
130            int right = query[1];
131
132            int firstBlockIndex = lowerBound(zeroBlockEnds, left);
133            int lastBlockIndex = upperBound(zeroBlockStarts, right) - 1;
134
135            if (
136                firstBlockIndex > zeroBlockCount - 1 ||
137                lastBlockIndex < 0 ||
138                firstBlockIndex >= lastBlockIndex
139            ) {
140                answer.add(totalOnes);
141                continue;
142            }
143
144            int firstBlockLength =
145                zeroBlockEnds.get(firstBlockIndex) -
146                Math.max(zeroBlockStarts.get(firstBlockIndex), left) +
147                1;
148
149            int lastBlockLength =
150                Math.min(zeroBlockEnds.get(lastBlockIndex), right) -
151                zeroBlockStarts.get(lastBlockIndex) +
152                1;
153
154            if (firstBlockIndex + 1 == lastBlockIndex) {
155                int bestGain = firstBlockLength + lastBlockLength;
156                answer.add(totalOnes + bestGain);
157                continue;
158            }
159
160            int leftGain =
161                firstBlockLength + zeroBlockLengths.get(firstBlockIndex + 1);
162
163            int rightGain =
164                zeroBlockLengths.get(lastBlockIndex - 1) + lastBlockLength;
165
166            int middleGain =
167                segmentTree.query(firstBlockIndex + 1, lastBlockIndex - 2);
168
169            int bestGain = Math.max(
170                Math.max(leftGain, rightGain),
171                middleGain
172            );
173
174            answer.add(totalOnes + bestGain);
175        }
176
177        return answer;
178    }
179
180    private int lowerBound(List<Integer> list, int target) {
181        int left = 0;
182        int right = list.size();
183
184        while (left < right) {
185            int mid = left + (right - left) / 2;
186
187            if (list.get(mid) < target) {
188                left = mid + 1;
189            } else {
190                right = mid;
191            }
192        }
193
194        return left;
195    }
196
197    private int upperBound(List<Integer> list, int target) {
198        int left = 0;
199        int right = list.size();
200
201        while (left < right) {
202            int mid = left + (right - left) / 2;
203
204            if (list.get(mid) <= target) {
205                left = mid + 1;
206            } else {
207                right = mid;
208            }
209        }
210
211        return left;
212    }
213}