// Last updated: 12/29/2025, 12:39:56 PM
1class Solution {
2
3    private Map<Character, Map<Character, Set<Character>>> allowedBlocks;
4
5    public boolean pyramidTransition(String bottom, List<String> allowed) {
6        allowedBlocks = new HashMap<>();
7        for (String block : allowed) {
8            char left = block.charAt(0);
9            char right = block.charAt(1);
10            char top = block.charAt(2);
11
12            allowedBlocks.putIfAbsent(left, new HashMap<>());
13            allowedBlocks.get(left).putIfAbsent(right, new HashSet<>());
14            allowedBlocks.get(left).get(right).add(top);
15        }
16        return buildPyramid(0, bottom, "");
17    }
18
19    private boolean buildPyramid(int currentIndex, String currentLayer, String nextLayer) {
20        if (currentLayer.length() == 0) {
21            return true;
22        }
23
24        if (currentIndex == currentLayer.length() - 1) {
25            return buildPyramid(0, nextLayer, "");
26        }
27
28        if (!allowedBlocks.containsKey(currentLayer.charAt(currentIndex))) {
29            return false;
30        }
31
32        Map<Character, Set<Character>> rightBaseMap = allowedBlocks.get(currentLayer.charAt(currentIndex));
33        char rightBase = currentLayer.charAt(currentIndex + 1);
34
35        if (!rightBaseMap.containsKey(rightBase)) {
36            return false;
37        }
38
39        Set<Character> possibleTopBlocks = rightBaseMap.get(rightBase);
40        for (char topBlock : possibleTopBlocks) {
41            String newNextLayer = nextLayer + topBlock;
42            if (buildPyramid(currentIndex + 1, currentLayer, newNextLayer)) {
43                return true;
44            }
45        }
46
47        return false;
48    }
49}