// Last updated: 10/20/2025, 11:38:04 AM
class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] a = getCount(word1);
        int[] b = getCount(word2);

        HashSet<Character> setA = getWordSet(word1);
        HashSet<Character> setB = getWordSet(word2);

        if (!setA.equals(setB)) return false;

        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }

        return true;
    }

    private HashSet<Character> getWordSet(String word) {
        return word
            .chars()
            .mapToObj(c -> (char)c)
            .collect(Collectors.toCollection(HashSet::new));
    }

    private int[] getCount(String word) {
        int[] arr = new int[26];
        for (char c : word.toCharArray()) {
            arr[c - 'a']++;
        }
        Arrays.sort(arr);
        return arr;
    }
}