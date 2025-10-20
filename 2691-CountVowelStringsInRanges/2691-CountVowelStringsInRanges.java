// Last updated: 10/20/2025, 11:34:09 AM
class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] sum = IntStream.rangeClosed(0, words.length)
                    .map(i -> i == 0 ? 0:
                        (isVowel(words[i - 1].charAt(0))
                        && isVowel(words[i - 1].charAt(words[i - 1].length() - 1)) ? 1 : 0))
                    .toArray();
        
        IntStream.range(1, sum.length).forEach(i -> sum[i] += sum[i-1]);

        return Arrays.stream(queries)
            .mapToInt(query -> sum[query[1] + 1] - sum[query[0]])
            .toArray();
    }

    private boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}