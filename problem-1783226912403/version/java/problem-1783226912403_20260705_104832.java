// Last updated: 7/5/2026, 10:48:32 AM
1class Solution {
2    int maxDigitRange = 0;
3    Map<Integer, Integer> map = new HashMap<>();
4    
5    public int maxDigitRange(int[] nums) {
6        for (int num : nums) {
7            getMaxDigitRange(num);
8        }
9        System.out.println(map);
10        return map.get(maxDigitRange);
11    }
12
13    public void getMaxDigitRange(int num) {
14        int maxDigit = 0;
15        int minDigit = 9;
16        int temp = num;
17        
18        while (temp > 0) {
19            maxDigit = Math.max(maxDigit, temp % 10);
20            minDigit = Math.min(minDigit, temp % 10);
21            temp /= 10;
22        }
23        maxDigitRange = Math.max(maxDigitRange, maxDigit - minDigit);
24        map.put(maxDigit - minDigit, map.getOrDefault(maxDigit - minDigit, 0) + num);
25    }
26}