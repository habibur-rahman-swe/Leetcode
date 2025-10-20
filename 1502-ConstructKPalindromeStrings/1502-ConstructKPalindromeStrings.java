// Last updated: 10/20/2025, 11:39:18 AM
class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k) return false;
        long oddCount = s.chars()
                        .boxed()
                        .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                        .values()
                        .stream()
                        .filter(count -> count % 2 != 0) 
                        .count();

        return oddCount <= k;
    }
}