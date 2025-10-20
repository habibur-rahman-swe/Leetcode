// Last updated: 10/20/2025, 11:31:51 AM
class Solution {
    public int minimumLength(String s) {
        return s.chars()
                .map(c -> c - 'a')
                .boxed()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .values()
                .stream()
                .mapToInt(count -> (int)(count % 2 == 0 ? 2 : 1))
                .sum();
    }
}