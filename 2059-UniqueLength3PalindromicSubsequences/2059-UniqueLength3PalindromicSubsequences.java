// Last updated: 10/20/2025, 11:37:04 AM
class Solution {
    public int countPalindromicSubsequence(String s) {
        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first, -1);

        IntStream.range(0, s.length())
                .forEach(i -> {
                    int curr = s.charAt(i) - 'a';
                    if (first[curr] == -1) {
                        first[curr] = i;
                    }
                    last[curr] = i;
                });

        return IntStream.range(0, 26)
                .filter(i -> first[i] != -1)
                .map(i -> {
                    if (last[i] - first[i] <= 1) {
                        return 0;
                    }
                    return (int) s.substring(first[i] + 1, last[i])
                            .chars()
                            .distinct()
                            .count();
                })
                .sum();

    }
}