// Last updated: 10/20/2025, 11:43:56 AM
class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Set<String> dictionary = new HashSet<>(Arrays.asList(words));
        List<String> answer = new ArrayList<>();

        for (String word : words) {
            int length = word.length();
            boolean[] dp = new boolean[length+1];
            dp[0] = true;

            for (int i = 1; i <= length; i++) {
                for (int j = (i == length ? 1 : 0); j < i && !dp[i]; j++) {
                    dp[i] = dp[j] & dictionary.contains(word.substring(j, i));
                }
            }
            if (dp[length]) {
                answer.add(word);
            }
        }
        return answer;
    }
}